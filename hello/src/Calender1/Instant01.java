package Calender1;

import java.util.Date;
import java.time.Instant;

public class Instant01 {
    public static void main(String[] args) {
        //LocalDateTime是系统所在时区的时间点，
        // 它是替代旧版Calendar的；
        // Instant是不带时区的时间点，
        // 默认是UTC时间点；Instant是
        // 精确到纳秒级别的，可以跟Date相互转换

        Instant in = Instant.now();
        System.out.println(in);

        Date date = Date.from(in);
        System.out.println(date);

        Instant ini = date.toInstant();
        System.out.println(ini);


    }
}
