package c322.homework.homework4.partd;

public abstract class MotorHome {

    String style, frame, engine, kitchen, name;


    abstract void produce();

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

}