package Calender1;
import java.io.Serializable;
import java.util.Calendar;
public class Calender01 {
    public static void main(String[] args) {
        //Calendar�ǳ�������ҹ�������˽�е�
        /*
        public abstract class Calendar implements
            Serializable, Cloneable, Comparable<Calendar>
               */
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

    }
}
