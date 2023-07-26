package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.restaurantMenuSimulation;

public class Meal {
    private String nameOfMeal;
    private String[] ingredients;
    private int calories;
    private double price;
    private boolean vegan;
    private boolean glutenFree;


    public Meal(String nameOfMeal, String[] ingredients, int calories, double price, boolean vegan, boolean glutenFree) {
        this.nameOfMeal = nameOfMeal;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
    }

    public String getNameOfMeal() {
        return nameOfMeal;
    }

    public void setNameOfMeal(String nameOfMeal) {
        this.nameOfMeal = nameOfMeal;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
