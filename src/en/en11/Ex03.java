package en.en11;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Taka on 2017/06/26.
 */
public class Ex03 {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();

        map.put("B.L.T","350");
        map.put("Bigburger","380");
        map.put("Cheeseburger","130");
        map.put("French fries","270");
        map.put("Humberger","100");
        map.put("Teriyaki","320");

        Set<String>keys = map.keySet();

        for(String key:keys){
            String value = map.get(key);
            System.out.println(key+","+value);
        }
    }
}
