package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{
    private AnimalKind animalKind = AnimalKind.COW;
    private FoodKind foodKind = FoodKind.HAY;

    private double weight = 1d; // вес животного
    private double foodCoeff = 0.05; // коэффициент веса еды к весу тела животного

    Cow() {
    }

    public Cow(double weight) { // не нужный объект, когда не задан тип животного
        this.weight = weight;
    }
    public double getFoodCoeff() {
        return foodCoeff;
    }
    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }
}
