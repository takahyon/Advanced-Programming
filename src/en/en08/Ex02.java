package en.en08;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.*;

/**
 * Created by Taka on 2017/06/05.
 */
public class Ex02 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        int dateStyle = DateFormat.FULL;
        int timeStyle = DateFormat.FULL;
        Locale locale = new Locale("ja", "JP");
        Date date = new Date();

        int weekInt1 = today.get(Calendar.DAY_OF_WEEK);
        String[] weekNames = new String[] { "日", "月", "火", "水", "木", "金", "土" };
        String weekStr3 = weekNames[weekInt1 - 1];
        DateFormat timestampFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println();
        System.out.print(DateFormat.getDateInstance().format(date)+"(" +weekStr3+ ")");
        System.out.println(DateFormat.getTimeInstance(timeStyle,locale).format(date));

        Calendar target = Calendar.getInstance();

        target.set(2017,1-1,1);
        long diff = today.getTimeInMillis() - target.getTimeInMillis();

        long days = diff / (1000 * 60 * 60 * 24);
        long hour =diff / (days);
        System.out.println("2017/1/1から数えて"+days+"日目");


    }
}
