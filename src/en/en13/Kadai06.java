package en.en13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.*;

/**
 * Created by Taka on 2017/07/10.
 */
public class Kadai06 {
    public static void main(String[] args) {


        Date date = new Date();
        Locale locale = new Locale("ja", "JP");
        int dateStyle = DateFormat.FULL;
        int timeStyle = DateFormat.FULL;

        System.out.println(DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale).

                format(date));

        System.out.println();


        Calendar cal = Calendar.getInstance();
        cal.set(2017,00,01);
        cal.add(Calendar.MONTH, -5);
        cal.add(Calendar.DATE, -20);

        System.out.println("result" + DateFormat.getDateInstance(dateStyle).

                format(date) );

    }
}
