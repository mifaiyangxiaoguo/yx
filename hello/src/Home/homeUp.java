package Home;

public class homeUp {
    public static void main(String[] args) {
        String str = "han shun ping";
        change(str);
        System.out.println(str);
    }

    public static void change(String str){
        if(str == null){
            System.out.println("字符串格式错误");
            return;
        }

        String[] str2 = str.split(" ");

        if(str2.length != 3){
            System.out.println("请输入正确格式");
            return;
        }

        String format = str.format("%s,%s .%c",str2[2],str2[0],str2[1].toUpperCase().charAt(0));
        System.out.println(format);
        System.out.println(str);

    }
}
