package c322.homework.homework4.partc;

public abstract class Mower {
    String type;

    // setType probably isn't necessary . . .

    public String getType(){
        return type;
    }
}

class PushMower extends Mower {
    public PushMower(){
        type = "Push Mower";

    }
}

class RiderMower extends Mower {
    public RiderMower(){
        type = "mower you can ride";
    }
}





