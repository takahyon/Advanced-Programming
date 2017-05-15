package en.en02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Cube[] c1=new Cube[6];

        for(int i=0; i<6; i++) {
            if (i %2==1){
                c1[i] = new Cube(i);
            }else{
                c1[i]= new Cube();
            }
            System.out.println("C"+i+1+", ");
            System.out.println("SIDE: "+ c1[i].getSide()+",VOL:" +c1[i].getVolume());

        }

    }
}
