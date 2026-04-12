package academy.devdojo.devdojojava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleteDateFormatTest01 {
    static void main(String[] args) {
        String pattern = "'Salvador' dd 'de' MMMM 'de' yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Salvador 12 de abril de 2026 "));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
