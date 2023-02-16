package c322.homework.homework5.partc;

public class Estate implements EstateInterface{
    int first, second;


    public Estate(int firstInput, int secondInput){
        firstInput = first / 43560;
        secondInput = second / 43560;
    }
    @Override
    public void getAcreage(int first, int second) {
       first = first;
       second = second ;
      // System.out.println(first );
      // System.out.println(second );
       System.out.println( (double) (second * first) / 43560);


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
