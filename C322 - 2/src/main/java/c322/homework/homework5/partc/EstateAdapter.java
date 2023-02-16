package c322.homework.homework5.partc;

public class EstateAdapter implements LotInterface {
    EstateInterface estateInterface;

    public EstateAdapter(EstateInterface estateInterface){
        this.estateInterface = estateInterface;
    }

    @Override
    public void setSize(int first, int second) {
        estateInterface.getAcreage(first, second);


    }

    @Override
    public int getLength() {
        return estateInterface.getFirst();
    }

    @Override
    public int getWidth() {
        return estateInterface.getSecond();
    }
}
