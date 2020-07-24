package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{




    Hamster() {
        super();
    }

    public  Hamster(double weight) { // не нужный объект, когда не задан тип животного
        super(AnimalKind.COW, FoodKind.HAY, 2);

    }

}
