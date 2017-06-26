package kg.kg11;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
/**
 * Created by Taka on 2017/06/26.
 */
public class MapSample02 {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();

        map.put("ID",213113.0);
        map.put("pass",123801-71-204.2);


        double id = map.get("ID");
        double pass = map.get("pass");
        System.out.println(id);
        System.out.println(pass);
    }
}
