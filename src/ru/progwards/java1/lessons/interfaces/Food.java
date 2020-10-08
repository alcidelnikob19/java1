package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight{
    private int weight;
    public int getWeight(int weight){
        return  weight;
    }
    public double getWeight() {

        return weight;
    }
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }
    public CompareResult CompareResult(CompareWeight smthHasWeigt) {
        Food food = (Food)smthHasWeigt;

        if (this.weight < food.weight) return CompareResult.LESS;
        if (this.weight == food.weight) return CompareResult.EQUAL;
        return CompareResult.GREATER;

    }
}
