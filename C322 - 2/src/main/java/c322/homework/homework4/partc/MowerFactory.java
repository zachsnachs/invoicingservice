package c322.homework.homework4.partc;

abstract class MowerFactory {
    SimpleMowerFactory mowerFactory;

    public MowerFactory(SimpleMowerFactory mowerFactory){
        this.mowerFactory = mowerFactory;
    }

    abstract Mower getMowerType(string mowerType);


}
