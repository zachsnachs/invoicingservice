package c322.homework.homework4.partc;

public abstract class MowerFactory {

    protected abstract Mower createMower(String type);

    public Mower makeMower(String type){
        Mower mower = createMower(type);
        System.out.println("this mower: " + mower.getType() );
        return mower;
    }


}
