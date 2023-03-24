package c322.lab.lab5.parta;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light sunRoomLight = new Light("Sun Room");
        CeilingFan ceilingFan= new CeilingFan("Basement");
        Stereo stereo = new Stereo("Bedroom");

        //lightCommand lightOn  = newLightCommand(light);

        remoteControl.setCommand(0, sunRoomLight::on, ceilingFan::on);
        remoteControl.setCommand(1, sunRoomLight::off, sunRoomLight::off);
        remoteControl.setCommand(2, ceilingFan::on, ceilingFan:: high);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }

}
