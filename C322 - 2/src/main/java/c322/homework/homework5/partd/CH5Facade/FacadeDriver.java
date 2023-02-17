package c322.homework.homework5.partd.CH5Facade;


import c322.homework.homework5.partd.mealfacade.MealFacade;

public class FacadeDriver {
    public static void main(String[] args) {

        System.out.println(" ----Meal assembly device activated: ----");

        MealFacade meal1 = new MealFacade();
        meal1.assembleMeal("Beef", "Potato", "Onion");
        MealFacade meal2 = new MealFacade();
        meal2.assembleMeal("Chicken", "Yam", "Lettuce");


    }
}
