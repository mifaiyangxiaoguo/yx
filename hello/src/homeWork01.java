public class homeWork01 {
    public static void main(String[] args) {
        String prise = "12345595964.12565";
        StringBuffer sb = new StringBuffer(prise);
        int sum = sb.lastIndexOf(".");
        System.out.println(sum);
//        sb.insert(sum-3,",");
//        System.out.println(sb);
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i-=3) {
            sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
