package kg.kg02;

/**
 * Created by Taka on 2017/04/17.
 */
public class Dot {
    int pos;
     void forward(){
         pos= pos +1;
     }
     boolean isGreaterThan(int p){
         if (pos >p) {
             return true;
         }else {
             return false;
         }
     }
}
