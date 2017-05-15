package en.en02;

import java.util.Random;

/**
 * Created by Taka on 2017/04/17.
 */
public class Cube {
    private int side;

    public Cube(int side){
        this.side=side;
    }

    public Cube(){
        this.side= new java.util.Random().nextInt(8)+3;

    }

    public int getSide(){
        return side;
    }
    public int getVolume(){
        return  side*side*side;
    }
}
