package ru.progwards.java1.lessons.interfaces;

public class Duck extends Animal {

    public Duck(double weight) { // не нужный объект, когда не задан тип животного
        super(AnimalKind.DUCK, FoodKind.HAY, weight,0.04);

    }

    public static void main(String[] args) {
        Duck Duck1 = new Duck( 220);


    }

}