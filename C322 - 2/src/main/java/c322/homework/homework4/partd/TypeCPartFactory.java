package c322.homework.homework4.partd;

public class TypeCPartFactory implements PartFactory {
    @Override
    public Kitchen createKitchen() {
        return new TypeCKitchen();
    }

    @Override
    public Style createStyle() {
        return new TypeCStyle();
    }

    @Override
    public Frame createFrame() {
        return new TypeCFrame();
    }

    @Override
    public Engine createEngine() {
        return new TypeCEngine();
    }


}