package academy.devdojo.devdojojava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    static void main(String[] args) {
        Date date = new Date(1775952205599L);// long 100000
        date.setTime(date.getTime() + 3_600_00);
        System.out.println(date);


    }
}
