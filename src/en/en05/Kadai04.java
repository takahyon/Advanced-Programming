package en.en05;

/**
 * Created by Taka on 2017/05/15.
 */
public class Kadai04 {
    public static void main(String[] args) {
        String istr = "192-0982";

        System.out.println(istr);
        System.out.println(istr.replaceAll("(\\d{3})-(\\d{4})", "$2-$1"));

        String istr2 = "<100%>Let's Java!</100%> <small>It's fun</small>";

        System.out.println(istr2);
        System.out.println(istr2.replaceAll("<(.*)>(.+)</\\1>","$2"));
        System.out.println(istr2.replaceAll("<(.*)>(.+)(</\\1>)","($2)"));
    }
}
