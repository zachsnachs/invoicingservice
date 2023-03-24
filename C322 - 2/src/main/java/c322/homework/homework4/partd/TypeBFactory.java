package c322.homework.homework4.partd;

public class TypeBFactory extends MotorHomeAbstractFactory {

    @Override
    MotorHome createMotorHome(String item) {
        MotorHome motorHome = null;
        PartFactory partFactory = new TypeBPartFactory();

        if (item.equals("style")) {
            motorHome = new StyleMotor(partFactory);
            motorHome.setName("Part B style");
        } else if (item.equals("frame")) {
            motorHome = new FrameMotor(partFactory);
            motorHome.setName("Part B motor");
        } else if (item.equals("kitchen")) {
            motorHome = new KitchenMotor(partFactory);
            motorHome.setName("Part B kitchen");
        } else if (item.equals("engine")) {
            motorHome = new EngineMotor(partFactory);
            motorHome.setName("Part B engine");

        }
        return motorHome;
    }
}
