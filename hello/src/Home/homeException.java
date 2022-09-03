package Home;

import java.util.Scanner;

public class homeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("请输入用户名------->>>");
                String passUser = scanner.next();
                X(passUser);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while(true){
            try {
                System.out.println("请输入密码------->>>");
                String passPassWord = scanner.next();
                Y(passPassWord);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while(true){
            try {
                System.out.println("请输入邮箱------->>>");
                String passEmail = scanner.next();
                Z(passEmail);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("正在登录程序");
    }

    public static void X(String str){
        if(!(str.length() > 1 && str.length() <5)){
            throw new RuntimeException("用户名应在二到四个字符之间");
        }
    }public static void Y(String str){
        if(!(str.length() == 6)){
            throw new RuntimeException("用户密码应为六位");
        }
        char[] arr = str.toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if(!(temp >= 48 && temp <= 57)){
                throw new RuntimeException("密码要全为数字");
            }
        }
    }
    public static void Z(String str){
        int temp = -1;
        StringBuffer str2 = new StringBuffer(str);
        if(!(str2.indexOf("@")>=0)){
            throw new RuntimeException("未找到@");
        }else if(!(str2.indexOf(".")>=0)){
            throw new RuntimeException("未找到.");
        }else if(!(str2.indexOf("@")<(str2.indexOf(".")))){
            throw new RuntimeException("邮箱格式错误");
        }
    }
}
