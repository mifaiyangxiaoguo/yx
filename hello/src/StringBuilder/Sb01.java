package StringBuilder;

public class Sb01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double r = (int)(Math.random()*(7-2)+1);
            System.out.println(r);
        }
        Father f = new Father(){
            public void test(){
                System.out.println("ÖØÐ´test");
            }
        };
        f.test();
        System.out.println(f.getClass());
    }

    interface Father{
        public void test();
    }
}
