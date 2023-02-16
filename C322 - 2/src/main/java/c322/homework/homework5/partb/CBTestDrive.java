package c322.homework.homework5.partb;

public class CBTestDrive {
    public static void main(String[] args) {
     Invoker invoker = new Invoker();
     ControlBox controlBox = new ControlBox();

     invoker.setCommand(controlBox :: powerOn);
     invoker.executor();
     Invoker.controlBox.sliderIncrease(50);

     Command setGradient = () -> {
         ControlBox.sliderIncrease(50);


     };



    }
}
