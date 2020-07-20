package ru.progwards.java1.lessons.classes;

public class Animal {
    static enum AnimalKind{ANIMAL, COW, HAMSTER, DUCK};
    static enum FoodKind{UNKNOWN, HAY, CORN};
    public double weight;
    public Animal(double weight){
        this.weight =weight;


    }
    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }
    //1.3 Метод
    public String toString(){
        System.out.println("I am "+getKind()+"eat "+getFoodKind());
        return null;
    }

    //, который возвращает информацию о животном в формате:
   // I am <AnimalKind>, eat <FoodKind>
}
