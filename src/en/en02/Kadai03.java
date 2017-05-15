package en.en02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Kadai03 {
    public static void main(String[] args) {
        Cube c1=new Cube(4);

        System.out.println("C1, ");
        System.out.println("SIDE: "+ c1.getSide()+",VOL:" +c1.getVolume());

        Cube c2 =new Cube();
        System.out.println("C2, ");
        System.out.println("SIDE: "+ c2.getSide()+",VOL:" +c2.getVolume());

    }
}

