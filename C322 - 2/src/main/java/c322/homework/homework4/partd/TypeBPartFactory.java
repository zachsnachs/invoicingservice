package c322.homework.homework4.partd;

public class TypeBPartFactory implements PartFactory {
    @Override
    public Kitchen createKitchen() {
        return new TypeBKitchen();
    }

    @Override
    public Style createStyle() {
        return new PartBStyle();
    }

    @Override
    public Frame createFrame() {
        return new PartBFrame();
    }

    @Override
    public Engine createEngine() {
        return new PartBEngine();
    }


}