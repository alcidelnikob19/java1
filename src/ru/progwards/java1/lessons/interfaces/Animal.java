package ru.progwards.java1.lessons.interfaces;


public class Animal implements FoodCompare{

    static enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    static enum FoodKind {UNKNOWN, HAY, CORN}

    private AnimalKind animalKind = AnimalKind.ANIMAL;
    private FoodKind foodKind = FoodKind.UNKNOWN;
    private double weight ; // вес животного
    private double foodCoeff=0.02; // коэффициент веса еды к весу тела животного

    Animal() {
    }
    Animal(AnimalKind cow, FoodKind hay, double weight) {
    }

    public Animal(double weight) { // не нужный объект, когда не задан тип животного
        this.weight = weight;
    }

    Animal(AnimalKind animalKind, FoodKind foodKind, double weight, double  foodCoeff) {
        this.animalKind = animalKind;
        this.foodKind = foodKind;
        this.weight = weight;
        this.foodCoeff = foodCoeff;
    }
    public double getWeight() {

        return weight;
    }


    public AnimalKind getKind() {
        return animalKind;
    }

    public FoodKind getFoodKind() {
        return foodKind;
    }
    public double getFoodCoeff() {
        return foodCoeff;
    }

    public void setFoodCoeff(double foodCoeff) {
        this.foodCoeff = foodCoeff;
    }

    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

 @Override
   public String toString() {
      return "I am " + getKind() + ", eat " + getFoodKind();
 }


    public String toStringFull( ){
        return "I am " + getKind() + ", eat " + getFoodKind()+" "+calculateFoodWeight();
    }


    public static void main(String[] args) {
        Animal animal = new Animal(457.0);
        System.out.println(animal.toStringFull());

    }
    public double getFood1kgPrice() {
        switch (foodKind) {
            case HAY:
                return 20;
            case CORN:
                return 50;
            default:
                return 0;
        }

    }
    @Override
    public int compareFoodPrice(Animal animal) {
        return Double.compare(this.getFoodPrice(),animal.getFoodPrice());

    }
    public double getFoodPrice(){
        return calculateFoodWeight() * getFood1kgPrice();
    }
}

