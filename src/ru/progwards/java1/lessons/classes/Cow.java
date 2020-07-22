package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{
    private AnimalKind animalKind = AnimalKind.COW;
    private FoodKind foodKind = FoodKind.HAY;

    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }
}
