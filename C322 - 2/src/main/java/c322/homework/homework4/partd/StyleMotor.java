package c322.homework.homework4.partd;

public class StyleMotor extends MotorHome {
    PartFactory partFactory;
    public StyleMotor(PartFactory partFactory) {
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
