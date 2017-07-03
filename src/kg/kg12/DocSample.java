package kg.kg12;

/**
 * Created by Taka on 2017/07/03.
 */
public class DocSample {
    public static void main(String[] args) {

        Person person = new Person("teu", 170.0, 75.0);
        System.out.println(person.toString());
        double bmi = person.getBMI();
        System.out.println(bmi);
        person.diet(3.2);
        System.out.println(person.getBMI());
    }

}
