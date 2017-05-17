package en.en05;

/**
 * Created by Taka on 2017/05/15.
 */
public class Kadai02 {
    public static void main(String[] args) {
        String istr = "TEL: 042-637-2111, TEL: 03-6424-2111";

        System.out.println(istr);
        System.out.println(istr.replaceAll("\\d{2,4}","x"));
        System.out.println(istr.replaceAll("^TEL","tel"));
        System.out.println(istr.replaceAll("\\d{4}$","*"));
    }
}
