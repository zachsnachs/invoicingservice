package c322.homework.homework4.partc;

public class ConcreteMowerFactory extends MowerFactory {

    public Mower getMowerType(String type) {

        return mower;
    }

    @Override
    protected Mower createMower(String type) {
        return null;
    }
}
