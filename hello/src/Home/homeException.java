package Home;

import java.util.Scanner;

public class homeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("�������û���------->>>");
                String passUser = scanner.next();
                X(passUser);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while(true){
            try {
                System.out.println("����������------->>>");
                String passPassWord = scanner.next();
                Y(passPassWord);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while(true){
            try {
                System.out.println("����������------->>>");
                String passEmail = scanner.next();
                Z(passEmail);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("���ڵ�¼����");
    }

    public static void X(String str){
        if(!(str.length() > 1 && str.length() <5)){
            throw new RuntimeException("�û���Ӧ�ڶ����ĸ��ַ�֮��");
        }
    }public static void Y(String str){
        if(!(str.length() == 6)){
            throw new RuntimeException("�û�����ӦΪ��λ");
        }
        char[] arr = str.toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if(!(temp >= 48 && temp <= 57)){
                throw new RuntimeException("����ҪȫΪ����");
            }
        }
    }
    public static void Z(String str){
        int temp = -1;
        StringBuffer str2 = new StringBuffer(str);
        if(!(str2.indexOf("@")>=0)){
            throw new RuntimeException("δ�ҵ�@");
        }else if(!(str2.indexOf(".")>=0)){
            throw new RuntimeException("δ�ҵ�.");
        }else if(!(str2.indexOf("@")<(str2.indexOf(".")))){
            throw new RuntimeException("�����ʽ����");
        }
    }
}
