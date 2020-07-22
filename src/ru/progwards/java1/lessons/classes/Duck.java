package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{
    private AnimalKind animalKind = AnimalKind.DUCK;
    private FoodKind foodKind = FoodKind.CORN;
    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }


}