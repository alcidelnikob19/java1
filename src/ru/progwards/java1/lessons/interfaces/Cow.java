package ru.progwards.java1.lessons.interfaces;

public class Cow extends Animal {


    Cow(double weight) {
        super(AnimalKind.COW, FoodKind.HAY, weight,0.05);
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow( 220);
    }

}
