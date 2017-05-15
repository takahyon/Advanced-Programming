package en.en03;

import static java.lang.Math.sqrt;

/**
 * Created by Taka on 2017/04/24.
 */
public class Triangle {


    public double a;
    public  double b;
    public  double c;


    public Triangle(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public boolean isTriangle(){
        if(a<(b+c)&&b<(c+a)&&c<(a+b)){
            return true;
        }else{
            return false;
        }
    }

    public double getArea(){
        double s = (a+b+c)/2;
       return sqrt(s*(s-a)*(s-b)*(s-c));

    }
}
