package kg.kg13;

/**
 * Created by Taka on 2017/07/10.
 */
public class Triangle {
    int base;
    int height;

    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (double)(base*height)/2;
    }

    public void enlarge(int n){
        this.base*=n;
        this.height*=n;
    }
}
