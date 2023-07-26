package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.restaurantMenuSimulation;

import java.util.Arrays;

public class Menu {
    private Meal[] meals = new Meal[10];
    private int mealCounter = 0;

    public void addMealToMenu(Meal meal) {
        meals[mealCounter++] = meal;
    }

    public void removeMealFromMenu(Meal meal) {
        int index = findIndexToRemoveMeal(meal);
        if (index != -1) {
            for (int i = index; i < mealCounter; i++) {
                meals[i] = meals[i + 1];
            }
            mealCounter--;
        } else {
            System.out.println("There is no such a meal in menu.");
        }
    }

    private int findIndexToRemoveMeal(Meal meal) {
        int index = -1;

        for (int i = 0; i < mealCounter; i++) {
            if (meals[i].equals(meal)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private double calculateTotalMenuPrice(){
        double totalPrice=0;
        for(int i=0;i<mealCounter;i++){
            totalPrice+=meals[i].getPrice();
        }
        return totalPrice;
    }

    public void printAllMeals() {
        System.out.println("------- MENU --------");
        for (int i = 0; i < mealCounter; i++) {
            Meal meal = meals[i];
            System.out.println("Meal Name: " + meal.getNameOfMeal() + '\n' +
                    "Meal Ingredients: " + Arrays.toString(meal.getIngredients()) + '\n' +
                    "Meal Calories : " + meal.getCalories() + '\n' +
                    "Meal Price: " + meal.getPrice() +"₺"+ '\n' +
                    "Is meal vegan ? " + (meal.isVegan() ? "YES" : "NO") + '\n' +
                    "Is meal gluten free? " + (meal.isGlutenFree() ? "YES" : "NO"));
            System.out.println("----------------------");
        }
        System.out.println("Total Menu Price: "+calculateTotalMenuPrice()+" ₺");
    }
}
