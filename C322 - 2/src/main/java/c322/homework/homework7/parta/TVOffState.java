package c322.homework.homework7.parta;

public class TVOffState implements State{
    TV tv;

    public TVOffState(TV tv){
        this.tv = tv;
    }

    @Override
    public void pressSwitch() {
        tv.pushButton();
        if (tv.getPower() == false) {
            System.out.println("Turning the TV on . . . ");
            tv.setState(tv.getTVOn());
        } else if (tv.getPower() == true){
            System.out.println("Turning the TV off. Have a nice day !");
            tv.setState(tv.getTVOff());
        }


    }
}
