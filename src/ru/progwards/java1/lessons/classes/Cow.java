package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{
   private AnimalKind animalKind = AnimalKind.COW;
   private FoodKind foodKind = FoodKind.HAY;

  private double weight = 1d; // вес животного
    static double foodCoeff = 0.05; // коэффициент веса еды к весу тела животного

    Cow() {

        super(AnimalKind.COW, FoodKind.HAY, weight, foodCoeff);
    }

    Cow(double weight) {
        super(AnimalKind.COW, FoodKind.HAY, weight, foodCoeff);
    }

    public AnimalKind getKind() {
        return animalKind;
    }
    public FoodKind getFoodKind() {
        return foodKind;
    }
}
