package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{
    private AnimalKind animalKind = AnimalKind.DUCK;
    private FoodKind foodKind = FoodKind.CORN;


    private static double foodCoeff = 0.04; // коэффициент веса еды к весу тела животного

    Duck() {
        super();
    }

    public Duck(double weight) { // не нужный объект, когда не задан тип животного
        super(AnimalKind.COW, FoodKind.HAY, weight);

    }
    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }


}