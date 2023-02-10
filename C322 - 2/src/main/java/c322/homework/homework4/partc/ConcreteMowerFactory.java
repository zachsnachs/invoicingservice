package c322.homework.homework4.partc;

public class ConcreteMowerFactory extends MowerFactory {

    @Override
    protected Mower createMower(String type) {
        if (type.equals("PushMower")){
            return new PushMower();
        }
        else if (type.equals("RiderMower")){
            return new RiderMower();
        }else return  null;
    }
}
