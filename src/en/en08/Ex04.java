package en.en08;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Taka on 2017/06/05.
 */
public class Ex04 {
    public static void main(String[] args) {


        Calendar today = Calendar.getInstance();
        Calendar target = Calendar.getInstance();
        int dateStyle = DateFormat.FULL;
        int timeStyle = DateFormat.FULL;
        Locale locale = new Locale("ja", "JP");
        Date date = new Date();
        int weekInt1 = today.get(Calendar.DAY_OF_WEEK);
        String[] weekNames = new String[] { "日", "月", "火", "水", "木", "金", "土" };
        String weekStr3 = weekNames[weekInt1 - 1];

        System.out.print(DateFormat.getDateTimeInstance().format(date)+"("+weekStr3+")");


//年,月,日(月は1月を0とするのでマイナス1)
        target.set(1970, 1 - 1, 1);

        long diff = today.getTimeInMillis() - target.getTimeInMillis();
        System.out.println(" "+diff);


        target.set(2020, 7-1, 24);

        long diff2 = today.getTimeInMillis() - target.getTimeInMillis();

        long days = diff2 / (1000 * 60 * 60*24);
        System.out.println(" "+days);
    }

}
