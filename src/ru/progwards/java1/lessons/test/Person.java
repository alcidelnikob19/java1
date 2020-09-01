package ru.progwards.java1.lessons.test;
/*
Создайте класс Person, содержащий
приватную переменную String name;
приватную переменную int age;
приватную переменную String country;
конструктор по умолчанию, устанавливающий country = "RU";
конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию,
и устанавливающий значения переменным name и age из соответствующих параметров;
публичные функции String getName(), int getAge(), String getCountry(), возвращающие значения
соответствующих переменных*/

class Person {
    private String name;
    private int age;
    private String country;

    public Person() {
        country = "RU";
    }
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getCountry() {return country;}

    public static class Child1{//вложенный
        public String hello(){
            return  ("привет");
        }
    }
    public static class Child2{//внутренний класс
        public String hello(){
            return  ("servus");
        }
    }
}
