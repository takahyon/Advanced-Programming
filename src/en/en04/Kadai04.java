package en.en04;

/**
 * Created by Taka on 2017/05/08.
 */
public class Kadai04 {
    public static void main(String[] args) {
        String str= "ADDR 1404-1, Katakuramachi, Hachioji, Tokyo 192-0982, JAPAN";
        String result;

        System.out.println(str);
        System.out.println(str.replaceFirst("[chi]","*"));
        System.out.println(str.replaceAll("[0-9]","?"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","x"));
        System.out.println(str.replaceAll("[A-Z]+","!")); //
        System.out.println(str.replaceAll("[0-9]{4}","?"));





    }
}
