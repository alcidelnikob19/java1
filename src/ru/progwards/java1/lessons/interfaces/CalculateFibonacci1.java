package ru.progwards.java1.lessons.interfaces;
public  class  CalculateFibonacci1 {

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

        CacheInfo ( int  n , int  fibo ) {
            this.n= n;
            this.fibo = fibo;
        }
    }

    // число Фибоначчи
    public  static  int  fiboNumber ( int  n ) {
        if (lastFibo . n == n) return lastFibo.fibo;
        int f1 =  0 ;
        int f2 =  1 ;
        int f;

        int i =  1 ;
       System.out.println("n= "+n);
        while (i ++  < n) {
           System.out.println("i= "+i);
            f = f2;
           System.out.println("f= f2 "+f2);

            f2 = f2 + f1;
         System.out.println("f2= f2 + f1 "+f2+" + "+f+" : " +f2);
            f1 = f;
         System.out.println("f1= f" +f+" : " +f1);

        }
        lastFibo.n = n;
        lastFibo . fibo = f2;
        return f2;
    }

    CalculateFibonacci1 () {
        lastFibo =  new  CacheInfo ();
    }
    public static CacheInfo getLastFibo(){
        return lastFibo;
    }
    public static void clearLastFibo(){
        lastFibo=null;
    }
    public static void main(String[] args) {
        System.out.println(fiboNumber(11));
        System.out.println("lf "+lastFibo);

    }
}