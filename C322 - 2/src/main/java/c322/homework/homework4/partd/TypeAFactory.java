package c322.homework.homework4.partd;

public class TypeAFactory extends MotorHomeAbstractFactory {

    @Override
    MotorHome createMotorHome(String item) {
        MotorHome motorHome = null;
        PartFactory partFactory = new TypeAPartFactory();

        if (item.equals("style")) {
            motorHome = new StyleMotor(partFactory);
            motorHome.setName("Part A style");
        } else if (item.equals("frame")) {
            motorHome = new FrameMotor(partFactory);
            motorHome.setName("Part A motor");
        } else if (item.equals("kitchen")) {
            motorHome = new KitchenMotor(partFactory);
            motorHome.setName("Part A kitchen");
        } else if (item.equals("engine")) {
            motorHome = new EngineMotor(partFactory);
            motorHome.setName("Part A engine");

        }
        return motorHome;
    }
}
