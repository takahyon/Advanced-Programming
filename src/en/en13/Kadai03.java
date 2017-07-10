package en.en13;

import java.*;
/**
 * Created by Taka on 2017/07/10.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String input ="School of Computer Science";

        System.out.println(input.length());

        System.out.println(input.substring(12,15));

        System.out.println(input.indexOf("e",24));

        //4.
        System.out.println(input.contains("put"));
        //5.
        String[] resultArray = input.split("e");
        for(int i = 0; i< resultArray.length; i++){
            System.out.print(resultArray[i]+",");
        }


    }
}





























