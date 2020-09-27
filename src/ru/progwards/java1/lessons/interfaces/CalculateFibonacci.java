package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    // Does number contains digit
    public static int fiboNumber(int n){
        if (n < 2) {

            return n;

        } else {

            return (fiboNumber(n-1)+fiboNumber(n-2));
        }
    }
    static  CacheInfo lastFibo;
    static {
        lastFibo =  new  CacheInfo ();
    }

    static  class  CacheInfo {

        int n; // число, для которого рассчитываем Фибоначчи
        int fibo; // результат расчета

        CacheInfo () {
            n =  - 1 ;
        }

    }
    CalculateFibonacci () {
        lastFibo =  new  CacheInfo ();
    }

    public static void main(String[] args) {
        
        System.out.println(fiboNumber(1));


    }
}