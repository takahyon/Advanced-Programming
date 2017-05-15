package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(String nm){
        this.name=nm;
    }
    public String getName(){
        return this.name;
    }
    public void setParam(double height,double weight){
        this.height=height;
        this.weight=weight;

    }
    public double getBMI(){
       return (this.weight)/(this.height)*(this.height);

    }
}
