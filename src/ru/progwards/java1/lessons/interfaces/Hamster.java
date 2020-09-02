package ru.progwards.java1.lessons.interfaces;

public class Hamster extends Animal {


    public  Hamster(double weight) { // не нужный объект, когда не задан тип животного
        super(AnimalKind.HAMSTER, FoodKind.CORN, weight,0.2);

    }
    public static void main(String[] args) {
        Hamster Hamster1 = new Hamster( 220);


    }

}
