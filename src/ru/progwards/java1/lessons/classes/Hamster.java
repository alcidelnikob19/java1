package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{



private static double foodCoeff = 0.03;
    Hamster() {
        super();
    }

    public  Hamster(double weight) { // не нужный объект, когда не задан тип животного
        super(AnimalKind.HAMSTER, FoodKind.CORN, 2,foodCoeff);

    }
    public static void main(String[] args) {
        Hamster Hamster1 = new Hamster( 220);
        System.out.println(Hamster1.toStringFull());

    }

}
