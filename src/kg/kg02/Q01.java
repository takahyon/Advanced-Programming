package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Q01 {
    public static void main(String args[]){
        Dot d1 , d2;
        d1 = new Dot();
        d1.pos = 10;

        d2 = new Dot();
        d2.pos = 5;

        System.out.println("d1: " + d1.pos);
        System.out.println("d2: " + d2.pos);

        d1.forward();
        d1.forward();
        d2.forward();

        System.out.println("-----------");
        System.out.println("d1: " + d1.pos);
        System.out.println("d2: " + d1.pos);

    }
}
