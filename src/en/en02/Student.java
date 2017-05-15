package en.en02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Student {
    private int score;

public void setScore(int s){
    this.score= s;
}
public int getScore(){
    return this.score;

}
boolean  isPass(){
    if(this.score>70){
        return true;
    }else{
        return false;
    }
}
}
