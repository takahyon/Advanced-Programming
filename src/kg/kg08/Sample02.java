package kg.kg08;


import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Taka on 2017/06/05.
 */
public class Sample02 {
    public static void main(String[] args) {
        Date date= new Date();
        String output;
        DateFormat dft;


        dft=DateFormat.getDateInstance();

        dft.format(date);

        output = dft.format(date);

        System.out.println(output);

    }
}
