package kg.kg05;

/**
 * Created by Taka on 2017/05/15.
 */
public class Ex01 {
    public static void main(String[] args) {

//Ex01
        String str = "School of Computer Science.";
        String ostr;

        System.out.println(str.replaceAll("oo", "-"));
        System.out.println(str.replaceAll("[o \\s]","*"));
        System.out.println(str.replaceAll("[.]","?"));

//02
        String strd ="[30/Apr/2014:21:37:38 +0900] GET /favicon.ico HTTP/1.1";


        System.out.println(strd.replaceAll("\\d",""));
        System.out.println(strd.replaceAll("\\w","?"));
        System.out.println(strd.replaceAll(" .","--"));
//03
        String str3="    Hello!!    Hello!!";

        System.out.println(str3.replaceAll("^ {4}",""));
        System.out.println(str3.replaceAll("Hello!!$","World..."));
        System.out.println(str3.replaceAll("^ {4}Hello","hoge"));
//04
        String str4 = "ac, abc, abbc, abbbc, abbbbc, abbbbbc";

        System.out.println(str4.replaceAll("ab*","!"));

    }
}
