package en.en08;

import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Date;

/**
 * Created by Taka on 2017/06/05.
 */
public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        String output;
        String output1;
        String  output2;
        DateFormat dft;


        dft = DateFormat.getDateInstance();

        System.out.println(date);

        output = dft.format(date);

        System.out.println(output);

        dft = DateFormat.getDateTimeInstance();

        output1 = dft.format(date);

        System.out.println(output1);

        dft = DateFormat.getTimeInstance();

        output2 = dft.format(date);

        System.out.println(output2);
    }
}
