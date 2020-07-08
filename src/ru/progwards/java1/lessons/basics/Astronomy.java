package ru.progwards.java1.lessons.basics;

public class Astronomy<sphereSquare> {

    public static Double sphereSquare(Double r){
        Double pi=3.14;
        Double S = 4*pi*r*r;
        return S;
    }

    public static  Double earthSquare(){

        return sphereSquare(6371.2);
    }
    public static  Double mercurySquare(){

       return sphereSquare(2439.7);
    }

    public static  Double jupiterSquare(){
        return sphereSquare(71492.0);
    }

    public static Double earthVsMercury(){
        Double raz =sphereSquare(6371.2)/sphereSquare(2439.7);
        return raz;
    }
    public static Double earthVsJupiter(){
        Double raz1 =sphereSquare(6371.2)/sphereSquare(71492.0);
        return raz1;
    }
    public static void main (String[]args){
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());

    }
}
