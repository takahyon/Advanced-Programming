package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Q02 {
    public static void main(String args[]){
        Dot d = new Dot();
        d.pos = 8;

        if (d.isGreaterThan(8)) {
            System.out.println("ok");
        }else{
            System.out.println("NG");
        }
    }
}
