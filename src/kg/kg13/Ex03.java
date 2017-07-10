package kg.kg13;

import java.util.regex.*;
import java.*;

/**
 * Created by Taka on 2017/07/10.
 */
public class Ex03 {
    public static void main(String[] args) {
        String input = "2017/07/10 15:47:51 c0116999ab Ex03.java ok.";

        //1.
        String a =input.replaceAll("\\d","+");
        System.out.println(a);

        //2.
        String b =input.replaceAll("\\D","@");
        System.out.println(b);

        //3.
        String c =input.replaceAll("[a-zA-Z]++","#");
        System.out.println(c);

        //4.
        String d = input.replaceAll("\\W","=");
        System.out.println(d);

        //5.
        String e = input.replaceAll(".$","?");
        System.out.println(e);
    }
}
