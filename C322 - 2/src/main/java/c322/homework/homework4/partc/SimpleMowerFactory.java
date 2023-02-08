package c322.homework.homework4.partc;

public class SimpleMowerFactory {

    public Mower createMower(String type) {
        Mower mower = null;

        if (type.equals("push")){
            mower = new PushMower();
        }else if (type.equals("rider")){
            mower = new RiderMower();
        }


        return mower;
    }

}
