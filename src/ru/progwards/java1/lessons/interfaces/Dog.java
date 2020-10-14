package ru.progwards.java1.lessons.interfaces;


public class Dog implements Speaking,Eating{
    public  String say() {
        return  "Гав";
    }



    @Override
    public String eat() {
        return "Мясо";
    }

}
