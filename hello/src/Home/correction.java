package Home;

import java.util.Arrays;
import java.util.Comparator;

public class correction {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("��¥��",100);
        books[1] = new Book("��ƿ÷�ߺ�",90);
        books[2] = new Book("������ժ",5);
        books[3] = new Book("java�����ŵ�����",300);

        Arrays.sort(books, new Comparator(){
            public int compare(Object o1, Object o2) {
                Book i1 = (Book)o1;
                Book i2 = (Book)o2;
                return i1.getPrise() - i2.getPrise();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
