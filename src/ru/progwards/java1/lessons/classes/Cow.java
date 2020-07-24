package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{


    private static double foodCoeff=0.05; // коэффициент веса еды к весу тела животного
    Cow() {

        super();
    }

    Cow(double weight) {
        super(AnimalKind.COW, FoodKind.HAY, weight);
    }

    public Cow(AnimalKind cow, FoodKind hay, int i) {
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow( 220);
        System.out.println(cow1.toStringFull());

    }

}
