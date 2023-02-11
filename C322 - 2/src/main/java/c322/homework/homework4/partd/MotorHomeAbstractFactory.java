package c322.homework.homework4.partd;


public abstract class MotorHomeAbstractFactory{
    abstract MotorHome createMotorHome(String item);

    public MotorHome orderMotorHome(String type) {
        MotorHome motorHome = createMotorHome(type);
        System.out.println(" . . . Producing a " + motorHome.getName());
        motorHome.produce();
        return motorHome;
    }


}