package kg.kg04;

/**
 * Created by Taka on 2017/05/08.
 */
public class Sample {
    public static void main(String[] args) {
        int n = 12345678;
        double d = -9876.54321;
        String str;

        str=String.format("%2$0,10.2f","%2$0,d", n,d);

        System.out.println(str);
    }
}
