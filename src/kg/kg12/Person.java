package kg.kg12;

/**
 * 人を表すクラス。
 * 人の名前、年齢、身長、体重を持ちます。
 *
 * @version 1.0
 * Created by Taka on 2017/07/03.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(String name , double height, double weight){
       this.name=name;
       this.height=height;
       this.weight=weight;
    }

    @Override
    public String toString(){
        return "name:"+name+", height:"+height+", weight"+weight;
    }

    /**
     * このインスタンスのBMI値を返します。
     * @return 体重[kg] / (身長[cm] * 身長[cm])
     */
    public double getBMI(){
        return  weight/(height*height);
    }

    public double diet(double a) {

           this.weight -= a;
            return this.weight;
        /*} catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("diet finished");
        }*/
    }

}
