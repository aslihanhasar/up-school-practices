package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.restaurantMenuSimulation;

public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Meal("İçli Köfte", new String[]{"bulgur", "salça", "kıyma", "baharat"}, 25, 30, false, false);
        Meal meal2 = new Meal("Mantı", new String[]{"mantı", "yoğurt"}, 500, 100, false, false);
        Meal meal3 = new Meal("Tavuklu Salata", new String[]{"tavuk", "marul", "domates"}, 100, 80, false, true);

        Menu menu1 = new Menu();
        menu1.addMealToMenu(meal1);
        menu1.addMealToMenu(meal2);
        menu1.addMealToMenu(meal3);

        menu1.printAllMeals();

        menu1.removeMealFromMenu(meal3);
        menu1.printAllMeals();
    }
}
