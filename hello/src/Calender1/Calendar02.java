package Calender1;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendar02 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        DateTimeFormatter f  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH : mm : ss");
        System.out.println(f.format(now));

        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime n = now1.plusDays(10);
        System.out.println(n);

        System.out.println(f.format(n));
    }
}
