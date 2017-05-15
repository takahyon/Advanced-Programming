package en.en02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Kadai02 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setScore(67);

        System.out.println("Student 1");
        System.out.println("SCORE: " +st1.getScore());
        System.out.println("PASS: "+ st1.isPass());

        Student st2 = new Student();
        st2.setScore(83);

        System.out.println("Student 2");
        System.out.println("SCORE: " +st2.getScore());
        System.out.println("PASS: "+ st2.isPass());
    }
}
