package kg.kg13;

/**
 * Created by Taka on 2017/07/10.
 */






public class Ex04 {

    public static void main(String[] args) {
        int[] a = {50, 40, 30, 20, 10, 0};

        for (int i = 0; i < 10; i++) {
            try {

                int val = 100 / a[i];
                System.out.println("val = " + val);
            } catch (java.lang.ArithmeticException e) {
                System.out.println("divided by zero");

            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }

    }
}
