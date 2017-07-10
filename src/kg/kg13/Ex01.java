package kg.kg13;

/**
 * Created by Taka on 2017/07/10.
 */
public class Ex01 {
    public static void main(String[] args) {

        Triangle t1 =new Triangle(2,5);
        Triangle t2 = new Triangle(3,7);

        //Area
        double t1A= t1.getArea();
        double t2A= t2.getArea();

        System.out.println(t1A);
        System.out.println(t2A);

        //enlarge
        t1.enlarge(2);
        t2.enlarge(3);

        t1A= t1.getArea();
        t2A= t2.getArea();

        System.out.println(t1A);
        System.out.println(t2A);

        System.out.println("");
    }
}
