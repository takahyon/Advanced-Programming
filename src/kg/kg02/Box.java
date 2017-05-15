package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Box {
    private int width;
    private int height;

    public void setWidth(int w){
        this.width=w;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return this.height*this.width;
    }
}
