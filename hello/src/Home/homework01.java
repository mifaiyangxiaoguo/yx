package Home;


import java.util.Comparator;

public class homework01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅芜湖",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("java从入门到放弃",300);
        for (int i = 0; i < books.length; i++) {
            books[i].getMes();
        }
        System.out.println("==========================");

        //升序排列
        com(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i1 - i2;
            }
        });


        System.out.println("============按照价格升序==============");
        for (int i = 0; i < books.length; i++) {
            books[i].getMes();
        }


        //降序排列
        com(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i2 - i1;
            }
        });


        System.out.println("============按照价格降序==============");
        for (int i = 0; i < books.length; i++) {
            books[i].getMes();
        }

        //按名字
        com2(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book i1 = (Book)o1;
                Book i2 = (Book)o2;
//                int a = (int)(i1.getName().length());
//                int b = (int)(i2.getName().length());
                return i1.getName().length() - i2.getName().length();
            }
        });


        System.out.println("============按照价格降序==============");
        for (int i = 0; i < books.length; i++) {
            books[i].getMes();
        }
        //System.out.println(Arrays.toString(books));
    }

    public static void com(Book[] b, Comparator c){
        Book[] temp = new Book[1];
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if(c.compare(b[j].getPrise(),b[j+1].getPrise()) > 0){
                    temp[0] = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp[0];
                }
            }
        }
    }

    public static void com2(Book[] b, Comparator c){
        Book[] temp = new Book[1];
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if(c.compare(b[j],b[j+1]) > 0){
                    temp[0] = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp[0];
                }
            }
        }
    }
}

class Book{
    private String name;
    private int prise;
    public Book(String name,int prise){
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }

    public void getMes(){
        System.out.println("书名 " + name + " 价格 " +prise);
    }
}
