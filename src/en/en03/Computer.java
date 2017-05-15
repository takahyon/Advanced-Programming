package en.en03;

/**
 * Created by Taka on 2017/04/24.
 */
public class Computer {

    String os;
    int ram;
    int disk;
    public Computer(){
    this.os=("UNKNWON");
    ram=8;
    disk=512;
    }
    public Computer(String os){
        this.os=os;
        ram=8;
        disk=512;
    }
    public Computer(String os, int ram){
        this.os=os;
        this.ram=ram;
        disk=512;
    }


    public String getOS(){
        return os;
    }
    public int getRam(){
        return ram;
    }
    public int getDisk(){
        return disk;
    }

}
