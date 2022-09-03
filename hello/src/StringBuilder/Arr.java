package StringBuilder;
import java.util.Arrays;
import java.util.Comparator;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1,5,-4,45,11};
        int[] arr2 = {1,3,7,2,8,4,6};
        bubble01(arr);
        System.out.println(Arrays.toString(arr));

        bubble02(arr2,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i2 - i1;
            }
        });

        System.out.println(Arrays.toString(arr2));

        int index = Arrays.binarySearch(arr2, 7);
        System.out.println(index);
    }

    public static void bubble01(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubble02(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(c.compare(arr[j],arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
