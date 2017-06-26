package en.en11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Taka on 2017/06/26.
 */
public class Ex01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("C0116773","B");
        map.put("C0116777","C");
        map.put("C0116771","S");
        map.put("C0116881","B");
        map.put("C0116889","A");

        String a = map.get("C0116889");
        String c = map.get("C0116777");

        System.out.println("C0116889 : "+a);
        System.out.println("C0116777 : "+c);
    }
}
