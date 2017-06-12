package en.en08;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.FULL;

/**
 * Created by Taka on 2017/06/05.
 */
public class Ex03 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = new Locale("ja", "JP");
        int dateStyle = DateFormat.FULL;
        int timeStyle = DateFormat.FULL;

        System.out.println(DateFormat.getDateTimeInstance(dateStyle,timeStyle,locale).format(date));

        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,2 );
        cal.add(Calendar.DATE, 27);

        System.out.println("今日は"+DateFormat.getDateInstance(dateStyle).format(date)+"です今日から2ヶ月と27日後は"+DateFormat.getDateInstance().format((cal.getTime()))+"です");
    }
}
