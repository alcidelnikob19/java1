package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight {
    private int weight;

    Food(int weight) {
        this.weight = weight;
    }

    public double getWeight() {

        return weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }

    public CompareResult CompareResult(CompareWeight smthHasWeigt) {
        Food food = (Food) smthHasWeigt;

        if (this.weight < food.weight) return CompareResult.LESS;
        if (this.weight == food.weight) return CompareResult.EQUAL;
        return CompareResult.GREATER;

    }

    public static void main(String[] args) {

        Food food1 = new Food(40);
        Food food2 = new Food(50);
        System.out.println(food1.CompareResult(food2));

    }
}