package Home;

public class homeUp {
    public static void main(String[] args) {
        String str = "han shun ping";
        change(str);
        System.out.println(str);
    }

    public static void change(String str){
        if(str == null){
            System.out.println("�ַ�����ʽ����");
            return;
        }

        String[] str2 = str.split(" ");

        if(str2.length != 3){
            System.out.println("��������ȷ��ʽ");
            return;
        }

        String format = str.format("%s,%s .%c",str2[2],str2[0],str2[1].toUpperCase().charAt(0));
        System.out.println(format);
        System.out.println(str);

    }
}
