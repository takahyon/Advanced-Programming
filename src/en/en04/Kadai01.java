package en.en04;

/**
 * Created by Taka on 2017/05/08.
 */
public class Kadai01 {
    public static void main(String[] args) {
        int a =4053;
        String str;

        System.out.println(String.format("10進数：%d",a));
        System.out.println(String.format("8進数：%o",a));
        System.out.println(String.format("16進数：%h",a));
        System.out.println(String.format("%,d",a));
        System.out.println(String.format("%,10d",a));
        System.out.println(String.format("%0+8d",a));



    }

}
