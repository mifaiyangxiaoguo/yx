public class ho {
    public static void main(String[] args) {
            StringBuffer prise = new StringBuffer("123456789.26");
            prise.replace(3,3,",");
            prise.replace(7,7,",");
        System.out.println(prise);
    }
}
