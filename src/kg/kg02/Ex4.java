package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Ex4 {
    public static void main(String[] args) {
        Person p1;
        String str;
        double bmi;

            p1 =new Person("mashiro");


        str = p1.getName();
        p1.setParam(1.65,56.8);
        bmi = p1.getBMI();
        System.out.println("NAME :"+ str);
        System.out.println("BMI :"+ bmi);

    }
}
