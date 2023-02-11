package c322.homework.homework4.partd;

public class MotorHomeTestDrive {
    public static void main(String[] args) {
       MotorHomeAbstractFactory typeA = new TypeAFactory();
       MotorHomeAbstractFactory typeB = new TypeBFactory();
       MotorHomeAbstractFactory typeC = new TypeCFactory();

       MotorHome motorHome = typeA.orderMotorHome("style");
       System.out.println("Making a " + motorHome);

       motorHome = typeB.orderMotorHome("kitchen");
       System.out.println("Making a " + motorHome);

        motorHome = typeC.orderMotorHome("frame");
        System.out.println("Making a " + motorHome);
    }
}
