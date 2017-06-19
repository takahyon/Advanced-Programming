package en.en09;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taka on 2017/06/12.
 */
public class Ex01 {
    public static void main(String[] args) {
         List data = new ArrayList();

         String s1 ="School";

         String s3 ="Computer";


         data.add(s1);
         data.add(s3);
        System.out.println("===Before===");
        System.out.println(data.size());
         for(int i=0; i< data.size(); i++){
             String str= (String)data.get(i);
             System.out.println(str);
         }
        String s2 ="of";
        data.add(s2);
        System.out.println("===After===");
        System.out.println(data.size());
        for(int i=0; i< data.size(); i++){
            String str= (String)data.get(i);
            System.out.println(str);

        }
    }
}
