package c322.homework.homework3.parta;

public interface CalcBehavior {
      double calcStuff(double inputA, double inputB);
}

// I'm encapsulating behavior into classes to be called later
class Adder implements CalcBehavior{

    @Override
    public double calcStuff(double inputA, double inputB) {
        return inputA + inputB;
    }
}

class Sub implements CalcBehavior{

    @Override
    public double calcStuff(double inputA, double inputB) {
        return inputA - inputB;
    }
}

class Multi implements CalcBehavior{

    @Override
    public double calcStuff(double inputA, double inputB) {
        return inputA * inputB;
    }
}

class Divid implements CalcBehavior{

    @Override
    public double calcStuff(double inputA, double inputB) {
        return inputA / inputB;
    }
}



class CalcContext {
    private CalcBehavior calcBehavior;
    public CalcContext(CalcBehavior decider) {
        this.calcBehavior = decider;
    }
    public double doCalc(double inputA, double inputB) {
        return calcBehavior.calcStuff(inputA, inputB);
    }
}