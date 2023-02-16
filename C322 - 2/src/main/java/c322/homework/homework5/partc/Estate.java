package c322.homework.homework5.partc;

public class Estate implements EstateInterface{
    int first, second;
    @Override
    public void getAcreage(int first, int second) {
       this.first = first / 43560;
       this.second = second / 43560;

    }

    @Override
    public int getFirst() {
        return first;
    }

    @Override
    public int getSecond() {
        return second;
    }
}
