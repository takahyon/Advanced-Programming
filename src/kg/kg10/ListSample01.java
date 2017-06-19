package kg.kg10;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taka on 2017/06/19.
 */
public class ListSample01 {
    public static void main(String[] args) {
        List data = new ArrayList();

        String str = "First string";
        Person psn = new Person("Taro", 20);

        data.add(str);
        data.add(psn);

        String a =(String)data.get(0);
        System.out.println("0番目の要素:" + a);

        Person p = (Person)data.get(1);
        System.out.println("0番目の要素:" + p);
    }
}
