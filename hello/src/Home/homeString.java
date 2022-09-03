package Home;

public class homeString {
    public static void main(String[] args) {
            String str = "abcdef";
            str = reverse(str,1,4);
        }
    public static String reverse(String str,int start,int end){
        char[] arr = str.toCharArray();
        char temp;
        for (int i = start , j = end ; i < j ; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return new String(arr);
    }

}
