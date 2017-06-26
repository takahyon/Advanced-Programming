package en.en11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Taka on 2017/06/26.
 */
public class Ex02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Cheeseburger",130);
        map.put("Teriyaki",320);
        map.put("B.L.T",350);
        map.put("Humberger",100);
        map.put("Bigburger",380);
        map.put("French fries",270);


        int a = map.get("B.L.T");
        int c = map.get("French fries");




        System.out.println("B.L.T: " + a);
        System.out.println("French fries: " + c);
    }
}
