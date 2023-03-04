package c322.homework.homework7.parta;

public class TV  {
    State tvOff;
    State tvOn;

    State state = tvOff;
    boolean power = false;

    public TV(boolean powered){
        tvOff = new TVOffState(this);
        tvOn = new TVOnState(this);

        this.power = powered;

        if (power == false){
            state = tvOff;
        } else if (power == true) {
            state = tvOn;

        }
    }


    void pwrOn(boolean power) {
        this.power = true;
        System.out.println("The TV is powering on . . . ");
    }

    void pwrOff(boolean power) {
        this.power = false;
        System.out.println("The TV is powering off . . . ");
    }

    void setState(State state) {
        this.state = state;
    }

    public void pushButton(){
        this.state.pressSwitch();
    }

    public State getState() {
        return state;
    }

    boolean getPower() {
        return power;
    }

    public State getTVOff() {
        return tvOff;
    }

    public State getTVOn() {
        return tvOn;
    }

}
