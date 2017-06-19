package en.en09;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taka on 2017/06/12.
 */
public class Ex02 {
    public static void main(String[] args) {
        List data = new ArrayList();

        String s1 ="Tokyo";
        String s2 ="Kanagawa";
        String s3 ="Saitama";
        String s4 = "Chiba";
        String s5 = "Gunma";


        data.add(s1);
        data.add(s2);
        data.add(s3);
        System.out.println("===Item===");
        System.out.println(data.size());
        for(int i=0; i< data.size(); i++){
            String str= (String)data.get(i);
            System.out.println(str);
        }


        System.out.println("===Checking Kanagawa===");
        if(data.contains(s2)) {
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

        System.out.println("===Checking Chiba===");
        if(data.contains(s4)) {
            System.out.println("found");
        }else{
            System.out.println("Not Found");
        }

        System.out.println("===Replacing an Item===");

        data.set(1,s5);

        for(int i=0; i< data.size(); i++){
            String str= (String)data.get(i);
            System.out.println(str);
        }
    }
}
