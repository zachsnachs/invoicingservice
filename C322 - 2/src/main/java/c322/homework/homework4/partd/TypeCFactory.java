package c322.homework.homework4.partd;

public class TypeCFactory extends MotorHomeAbstractFactory {

    @Override
    MotorHome createMotorHome(String item) {
        MotorHome motorHome = null;
        PartFactory partFactory = new TypeCPartFactory();

        if (item.equals("style")) {
            motorHome = new StyleMotor(partFactory);
            motorHome.setName("Part C style");
        } else if (item.equals("frame")) {
            motorHome = new FrameMotor(partFactory);
            motorHome.setName("Part C motor");
        } else if (item.equals("kitchen")) {
            motorHome = new KitchenMotor(partFactory);
            motorHome.setName("Part C kitchen");
        } else if (item.equals("engine")) {
            motorHome = new EngineMotor(partFactory);
            motorHome.setName("Part C engine");

        }
        return motorHome;
    }
}
