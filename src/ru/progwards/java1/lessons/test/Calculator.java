package ru.progwards.java1.lessons.test;
class Calculator {
    private int result;



    public Calculator() {
        result = 0;

    }
    public Calculator(int result) {
        this.result =result;

    }
    public int get() {return result;}

    public void set(int num){
        result = num;
    }


    public static void main(String[] args) {
        Calculator c= new Calculator(5);

        c.set(8);
        int e=c.get();
        System.out.println(e);
    }
}