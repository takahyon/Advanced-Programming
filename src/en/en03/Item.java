package en.en03;

/**
 * Created by Taka on 2017/04/24.
 */
public class Item {
    String name;
    static int price;

    public Item(String str,int i){
        this.name = str;
        this.price+=i;
    }

    public String getProperties(){
        return (name+" , "+price);
    }
    public static int  getPrice(){

        return price;
    }
}
