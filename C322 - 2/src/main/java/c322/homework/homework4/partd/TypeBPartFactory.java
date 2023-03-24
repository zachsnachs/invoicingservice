package c322.homework.homework4.partd;

public class TypeBPartFactory implements PartFactory {
    @Override
    public Kitchen createKitchen() {
        return new TypeBKitchen();
    }

    @Override
    public Style createStyle() {
        return new TypeBStyle();
    }

    @Override
    public Frame createFrame() {
        return new TypeBFrame();
    }

    @Override
    public Engine createEngine() {
        return new TypeBEngine();
    }


}