package Calender1;

import java.util.Date;
import java.time.Instant;

public class Instant01 {
    public static void main(String[] args) {
        //LocalDateTime��ϵͳ����ʱ����ʱ��㣬
        // ��������ɰ�Calendar�ģ�
        // Instant�ǲ���ʱ����ʱ��㣬
        // Ĭ����UTCʱ��㣻Instant��
        // ��ȷ�����뼶��ģ����Ը�Date�໥ת��

        Instant in = Instant.now();
        System.out.println(in);

        Date date = Date.from(in);
        System.out.println(date);

        Instant ini = date.toInstant();
        System.out.println(ini);


    }
}
