package c322.homework.homework4.partc;

public class MowerDriver {

    public static void main(String[] args) {
        MowerFactory mowerFactory = new ConcreteMowerFactory();
        System.out.println("----- Mower Selector Helper ----");
        mowerFactory.createMower("RiderMower");
        System.out.println(mowerFactory.getMowerType("RiderMower"));
        mowerFactory.createMower("PushMower");
        System.out.println(mowerFactory.getMowerType("PushMower"));
    }
}
