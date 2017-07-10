package kg.kg13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Taka on 2017/07/10.
 */
public class Ex06 {
    public static void main(String[] args) {

        Date date = new Date();
        Locale locale = new Locale("ja", "JP");
        int dateStyle = DateFormat.FULL;
        int timeStyle = DateFormat.FULL;

        System.out.println(DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale).format(date));

        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 10);
        cal.add(Calendar.DATE, 10);

        System.out.println("今日は" + DateFormat.getDateInstance(dateStyle).format(date) + "です今日から10ヶ月と10日後は" + DateFormat.getDateInstance().format((cal.getTime())) + "です");
    }
}

