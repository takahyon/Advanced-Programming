package en.en03;
import java.*;



/**
 * Created by Taka on 2017/04/24.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String[] strs = new String[4];
        strs[0] = "computer science";
        strs[1] = "Katakuramachi, Hachioji, Tokyo";
        strs[2] = "Before-tax price is 500 yen";
        strs[3] = "Computer Science";

        System.out.println(strs[0].lastIndexOf("c"));
        System.out.println(strs[1].substring(8,13));
        System.out.println(Integer.parseInt(strs[2].substring(20,22))*1.08*10);
        for (int i=0; i<strs.length; i++){
          if(strs[i].equals("Computer Science")){
              System.out.println("CS　の　index　は "+ i);
          }
        }
    }
}
