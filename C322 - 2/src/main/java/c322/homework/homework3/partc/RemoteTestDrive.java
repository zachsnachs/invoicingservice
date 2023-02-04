package c322.homework.homework3.partc;

public class RemoteTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);


        remoteControl.onPush(0);
        remoteControl.offPush(0);
        remoteControl.offPush(1);
        remoteControl.onPush(1);
        remoteControl.offPush(2);
        remoteControl.onPush(2);
        remoteControl.onPush(3);
        remoteControl.offPush(3);
        remoteControl.onPush(4);
        remoteControl.offPush(4);


    }
}
