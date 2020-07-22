package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{
    private AnimalKind animalKind = AnimalKind.HAMSTER;
    private FoodKind foodKind = FoodKind.CORN;
    private double weight = 1d; // вес животного
    private double foodCoeff = 0.03; // коэффициент веса еды к весу тела животного

    Hamster() {
        super(AnimalKind.COW, FoodKind.HAY, weight, foodCoeff);
    }

    public  Hamster(double weight) { // не нужный объект, когда не задан тип животного
        super(AnimalKind.COW, FoodKind.HAY, weight, foodCoeff);
        this.weight = weight;
    }
    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }
}
