package kg.kg11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Created by Taka on 2017/06/26.
 */
public class MapSample01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("kiwi","green");
        map.put("apple","red");
        map.put("grape", "blue");

        String result = map.get("kiwi");

        System.out.println(result);

    }
}
