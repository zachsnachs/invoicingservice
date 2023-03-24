package c322.homework.homework4.partc;

public abstract class MowerFactory {
    protected abstract Mower createMower(String type);

    public Mower getMowerType(String type){
        Mower mower = createMower(type);
        System.out.println("Here is a  " + mower.getType());
        return mower;
    }


}

