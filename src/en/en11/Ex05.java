package en.en11;
import java.util.*;
/**
 * Created by Taka on 2017/06/26.
 */
public class Ex05 {
    public static void main(String[] args) {

            String line = "There is strong shadow where there is much light";
            line= line.toLowerCase();


            Scanner scanner = new Scanner(line);
            TreeMap<String, Integer> termMap = new TreeMap<String,Integer>();

            while (scanner.hasNext()) {
                String term = scanner.next();

                int count = 1;
                if (termMap.containsKey(term)) {
                    count += termMap.get(term);
                }
                termMap.put(term, count);
            }


            Iterator<String> iterator = termMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                Integer value = termMap.get(key);
                System.out.format("%-8s",key);
                System.out.println(": " + value);

            }
        }
    }
