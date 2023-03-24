package c322.homework.homework5.partd.mealcomponets;

public class MealVegetable {
    String description, veg;
    MealStarch starch;
   MealProtein protein;



    public MealVegetable(String description){
        this.description = description;
    }

    public void addMeal(String veg){
        this.veg = veg;
        System.out.println("Vegetable " + " ( " + veg + " ) " + "added" +
                " " + "to meal");
    }
}
