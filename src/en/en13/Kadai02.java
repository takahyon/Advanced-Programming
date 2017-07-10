package en.en13;

/**
 * Created by Taka on 2017/07/10.
 */
public class Kadai02 {
    public static void main(String[] args) {

        Student[] a = new Student[3];
        a[0] = new Student("C0115991", 83);
        a[1] = new Student("C0115992", 57);
        a[2] = new Student("C0115993", 70);

        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        System.out.println(a[2].toString());
        a[1].add(5);
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        System.out.println(a[2].toString());



    }

}

