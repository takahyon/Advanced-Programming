package en.en05;

/**
 * Created by Taka on 2017/05/15.
 */
public class Kadai01 {
    public static void main(String[] args) {
        String istr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuwxyz";

        System.out.println(istr);

        System.out.println(istr.replaceAll("[his]","*"));
        System.out.println(istr.replaceAll("[^This]","*"));
        System.out.println(istr.replaceAll("[K-Zk-z]+","*"));
    }
}
