package c322.homework.homework3.partc;

public class RemoteTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
/*
        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);


*/

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

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
        remoteControl.undoButtonPush();


    }
}
