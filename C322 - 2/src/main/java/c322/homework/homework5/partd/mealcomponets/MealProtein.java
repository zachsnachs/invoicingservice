package c322.homework.homework5.partd.mealcomponets;

public class MealProtein {
    String description, protein;
    MealStarch starch;
    MealVegetable veg;



    public MealProtein(String description){
        this.description = description;
    }

    public void addMeal(String protein){
        this.protein = protein;
        System.out.println("Protein " + " ( " + protein + " ) " + "added" +
               " " + "to meal");
    }
}
