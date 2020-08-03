package ru.progwards.java1.lessons.test;
public class Calculator {
    private int result;



    public Calculator() {
        result = 0;

    }
    public Calculator(int result) {
        this.result =result;

    }
    public int getResult() {return result;}

    public void set(int num){
        result = num;
    }
    public void add(int num){
        result = +num;
    }
    public void sub(int num){
        result = -num;
    }


    public static void main(String[] args) {
        Calculator c= new Calculator(5);


        int e=c.getResult();

    }
}
