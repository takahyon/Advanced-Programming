package en.en04;

/**
 * Created by Taka on 2017/05/08.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String str= "Tokyo University of Technology";
        String result;

        System.out.println(str);

        System.out.println(str.replaceAll("T","t"));
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("[oi]","+"));
        System.out.println(str.replaceAll("[^oi]","-"));


    }
}
