package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{
    private AnimalKind animalKind = AnimalKind.DUCK;
    private FoodKind foodKind = FoodKind.CORN;

    private double weight = 1d; // вес животного
    private double foodCoeff = 0.04; // коэффициент веса еды к весу тела животного

    Duck() {
    }

    public Duck(double weight) { // не нужный объект, когда не задан тип животного
        this.weight = weight;
    }
    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }


}