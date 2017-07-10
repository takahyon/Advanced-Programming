package en.en13;

/**
 * Created by Taka on 2017/07/10.
 */
public class Kadai05 {
    public static void main(String[] args) {


        String input = "http://www.teu.ac.jp/gakubu/cs/006633.html";

        //1.
        String a = input.replaceAll("\\d", "*");
        System.out.println(a);

        //2.
        String b = input.replaceAll("\\.", "*");
        System.out.println(b);

        //3.
        String c = input.replaceAll("[a-c]", "*");
        System.out.println(c);

        //4.
        String d = input.replaceAll("^h", "*");
        System.out.println(d);

        //5.
        String e = input.replaceAll("\\w++", "*");
        System.out.println(e);
    }
}