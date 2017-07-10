package en.en13;

/**
 * Created by Taka on 2017/07/10.
 */
public class Kadai04 {
    public static void main(String[] args) {
    int a = 2048;
    double b =8.3144598;
        System.out.println(String.format("%,d",a));

        System.out.println(String.format("%9d",a));

        System.out.println(String.format("%,08d",a));

        System.out.println(String.format("%6.4f",b));

        System.out.println(String.format("%010.2f",b));

    }
}