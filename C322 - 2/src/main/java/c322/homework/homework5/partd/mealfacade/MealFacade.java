package c322.homework.homework5.partd.mealfacade;

import c322.homework.homework5.partd.mealcomponets.MealProtein;
import c322.homework.homework5.partd.mealcomponets.MealStarch;
import c322.homework.homework5.partd.mealcomponets.MealVegetable;

public class MealFacade {
    MealProtein protein;
    MealStarch starch;

    MealVegetable veg;

    public MealFacade(){
            /*
            MealProtein protein,
            MealStarch starch,
            MealVegetable veg){
        this.protein = protein;
        this.starch = starch;
        this.veg = veg;*/

        protein = new MealProtein("Protein");
        veg = new MealVegetable("Vegetable");
        starch = new MealStarch("Starch");
    }


    public void oldAssembleMeal(String meaty, String starchy, String veggie){
        protein.addMeal(meaty);
        starch.addMeal(starchy);
        veg.addMeal(veggie);

    }

    public void assembleMeal(String meaty, String starchy, String veggie ){
        protein.addMeal(meaty);
        starch.addMeal(starchy);
        veg.addMeal(veggie);
    }
}
