package c322.homework.homework5.partd.mealcomponets;

public class MealStarch {
    String description, starch;
    MealProtein protein;
    MealVegetable veg;



    public MealStarch(String description){
        this.description = description;
    }

    public void addMeal(String starch){
        this.starch = starch;
        System.out.println("Starch " + " ( " + starch + " ) " + "added" +
                " " + "to meal");
    }
}
