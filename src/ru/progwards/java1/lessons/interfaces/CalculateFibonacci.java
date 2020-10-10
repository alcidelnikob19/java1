package ru.progwards.java1.lessons.interfaces;

public  class  CalculateFibonacci {

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

    // число Фибоначчи
    public  static  int  fiboNumber ( int  n ) {
        if (lastFibo . n == n) return lastFibo.fibo;
        int f1 =  0 ;
        int f2 =  1 ;
        int f;

        int i =  1 ;

        while (i ++  < n) {

            f = f2;

       f2 = f2 + f1;

          f1 = f;


        }
        lastFibo.n = n;
        lastFibo . fibo = f2;
        return f2;
    }

    CalculateFibonacci () {
        lastFibo =  new  CacheInfo ();
    }
//    public static CacheInfo getLastFibo(){
//        return lastFibo;
//    }
//    public static void clearLastFibo(){
//        lastFibo=null;
//    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(11));
        System.out.println("lf "+lastFibo);

    }
}