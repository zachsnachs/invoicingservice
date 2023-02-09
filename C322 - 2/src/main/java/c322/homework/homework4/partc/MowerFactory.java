package c322.homework.homework4.partc;

public abstract class MowerFactory {

    protected abstract Mower makeMower(String type);

    public Mower makeMower(String type){
        Mower mower = makeMower(type);


        return mower;
    }


}
