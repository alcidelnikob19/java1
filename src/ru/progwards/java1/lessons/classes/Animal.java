package ru.progwards.java1.lessons.classes;


public class Animal {

    static enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    static enum FoodKind {UNKNOWN, HAY, CORN}

    private AnimalKind animalKind = AnimalKind.ANIMAL;
    private FoodKind foodKind = FoodKind.UNKNOWN;

    private double weight = 1d; // вес животного
    double foodCoeff = 0.02; // коэффициент веса еды к весу тела животного

    Animal() {
    }

    Animal(double weight) { // не нужный объект, когда не задан тип животного
        this.weight = weight;
    } //сохраняет вес

    Animal(AnimalKind animalKind, FoodKind food, double weight, double foodCoeff) {
        this.animalKind = animalKind;
        this.foodKind = food;
        this.weight = weight;
        this.foodCoeff = foodCoeff;
    }

    public AnimalKind getKind() {
        return animalKind;
    }

    public FoodKind getFoodKind() {
        return foodKind;
    }

    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public double getWeight() {
        return weight;
    }

    void setFoodCoeff(double foodCoeff) {
        this.foodCoeff = foodCoeff;
    }
    public double getFoodCoeff() {
        return foodCoeff;
    }
    public double getCoeff() {
        return foodCoeff;
    }

    // рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела
    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
    }

}


/*public class Animal {
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
    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public double getWeight() {
        return weight;
    }
    public double getFoodCoeff() {
        return foodCoeff;
    }
    public double getCoeff() {
        return foodCoeff;
    }
    public double calculateFoodWeight() {

        return getWeight() * getFoodCoeff();
    }

    //, который возвращает информацию о животном в формате:
   // I am <AnimalKind>, eat <FoodKind>

}
*/