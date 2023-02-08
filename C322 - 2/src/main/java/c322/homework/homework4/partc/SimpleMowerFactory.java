package c322.homework.homework4.partc;

public class ConcreteMowerFactory extends MowerFactory {

    public Mower getMowerType(String type) {
        Mower mower = null;

        if (type.equals("push")){
            mower = new PushMower();
        }else if (type.equals("rider")){
            mower = new RiderMower();
        }


        return mower;
    }



}
