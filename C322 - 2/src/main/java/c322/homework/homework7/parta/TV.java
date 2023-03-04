package c322.homework.homework7.parta;

public class TV implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void pressSwitch() {
        this.tvState.pressSwitch();
    }
}