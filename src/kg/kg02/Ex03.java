package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Ex03 {
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.setWidth(5);
        b.setHeight(3);

        int area = b.getArea();
        System.out.println("AREA:" + area);
    }
}

