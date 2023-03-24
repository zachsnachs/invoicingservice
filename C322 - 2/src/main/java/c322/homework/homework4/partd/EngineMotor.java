package c322.homework.homework4.partd;

public class EngineMotor extends MotorHome {
    PartFactory partFactory;
    public EngineMotor(PartFactory partFactory) {
        this.partFactory = partFactory;
    }

    @Override
    void produce() {
        System.out.println("Producing" + name);
        engine = partFactory.createEngine();
        style = partFactory.createStyle();
        kitchen = partFactory.createKitchen();
        frame = partFactory.createFrame();
    }
}
