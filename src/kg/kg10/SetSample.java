package kg.kg10;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Taka on 2017/06/19.
 */
public class SetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("grape");
        set.add("orange");
        set.add("apple");
        set.add("orange");

        for (String string : set){
            System.out.println(string);
        }
    }
}
