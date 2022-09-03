package Calender1;

public class daad {
    public static void main(String[] args) {
        daad d = new daad();
        A a = d.new A();

        a.change(a.dd,a.str);

        System.out.println(a.dd + " " + a.str);

    }

    public  class A{
        String str = "yx";
        int dd = 1;
        public void change(int d,String str){
            str = "ljj";
            dd = 2;
        }
    }
}

