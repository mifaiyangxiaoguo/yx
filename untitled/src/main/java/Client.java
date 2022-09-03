import java.io.*;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        //超时时间
        socket.setSoTimeout(3000);
        //连接超时时间，端口号
        //连接本地，端口2000，超时时间3000
        socket.connect(new InetSocketAddress(Inet4Address.getLocalHost(),2000),3000);
        System.out.println("已发起服务器连接，并进入后续流程");
        //本地的地址和本地的端口
        System.out.println("客户端信息" + socket.getLocalAddress()+"p："+socket.getLocalPort());
        System.out.println("服务器信息" + socket.getInetAddress()+"p:"+socket.getPort());
        try {
            //发送接收数据
            todo(socket);
        }catch (Exception e){
            System.out.println("异常关闭");
        }
        //释放资源
        socket.close();
        System.out.println("客户端已退出");
    }
    private static void todo(Socket client) throws IOException{
        //构建键盘输入流
        InputStream in = System.in;
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        //得到Socket输出流，并转换为打印流
        OutputStream outputStream = client.getOutputStream();
        PrintStream socketPrintStream = new PrintStream(outputStream);

        InputStream inputStream = client.getInputStream();
        BufferedReader socketBufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //键盘读取一行
        boolean flag = true;
        do {
            String str = input.readLine();
            //发送到服务器
            socketPrintStream.println(str);

            String echo = socketBufferedReader.readLine();

            if("bye".equalsIgnoreCase(echo)){
                flag = false;
            }else{
                System.out.println(echo);
            }
        }while (flag);

        socketPrintStream.close();
        socketBufferedReader.close();
    }
}
