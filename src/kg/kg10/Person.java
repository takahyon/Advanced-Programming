package kg.kg10;

import java.io.PipedWriter;

/**
 * Created by Taka on 2017/06/19.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{"+"name=" + name + ", age=" + age + '}';

    }
}
