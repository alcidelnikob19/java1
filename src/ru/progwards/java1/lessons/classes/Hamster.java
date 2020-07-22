package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{
    private AnimalKind animalKind = AnimalKind.HAMSTER;
    private FoodKind foodKind = FoodKind.CORN;
    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }
}
