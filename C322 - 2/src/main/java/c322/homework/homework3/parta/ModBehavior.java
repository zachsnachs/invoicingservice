package c322.homework.homework3.parta;

public interface ModBehavior {
    double mod(double inputA, double inputB, double inputC);
}

class addMod implements ModBehavior {
    @Override
    public double mod(double inputA, double inputB, double inputC) {
        double tempAdd = inputA + inputB;
        return tempAdd % inputC;
    }
}

class subMod implements ModBehavior {
    @Override
    public double mod(double inputA, double inputB, double inputC) {
        double tempSub = inputA - inputB;
        return tempSub % inputC;
    }
}

class ModContext {
    private ModBehavior modBehavior;
    public ModContext(ModBehavior deciderMod) {
        this.modBehavior = deciderMod;
    }
    public double doMod(double inputA, double inputB, double inputC) {
        return modBehavior.mod(inputA, inputB, inputC);
    }
}