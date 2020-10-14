package ru.progwards.java1.lessons.interfaces;

public class Goat implements Speaking,Eating{
    public  String say() {
        return  "Мее";
    }



    @Override
    public String eat() {
        return "Сено";
    }
}
