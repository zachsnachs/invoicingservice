package c322.homework.homework4.partd;

public class TypeAPartFactory implements PartFactory {
    @Override
    public Kitchen createKitchen() {
        return new TypeAKitchen();
    }

    @Override
    public Style createStyle() {
        return new PartAStyle();
    }

    @Override
    public Frame createFrame() {
        return new PartAFrame();
    }

    @Override
    public Engine createEngine() {
        return new PartAEngine();
    }


}
