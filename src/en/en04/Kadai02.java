package en.en04;

/**
 * Created by Taka on 2017/05/08.
 */
public class Kadai02 {
    public static void main(String[] args) {
        double b = -271828.1828459;
        String str;

        System.out.println(String.format("%f",b));
        System.out.println(String.format("%.3f",b));
        System.out.println(String.format("%10.1f",b));
        System.out.println(String.format("%0,15.4f",b));
        System.out.println(String.format("%12.4e",b));


    }
}
