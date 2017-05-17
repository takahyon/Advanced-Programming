package en.en05;

/**
 * Created by Taka on 2017/05/15.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String istr = "error404, Mar 13 00:21:10 2017,  254651203 bytes";

        System.out.println(istr);
        System.out.println(istr.replaceAll(("\\d{9}"),"*"));
        System.out.println(istr.replaceAll("\\d{2,4}","*"));
        System.out.println(istr.replaceAll("\\d{4,}","*"));
    }
}
