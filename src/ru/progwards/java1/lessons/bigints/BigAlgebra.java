package ru.progwards.java1.lessons.bigints;

import java.math.*;

public class BigAlgebra {
    BigDecimal fastPow(BigDecimal num, int pow) {

        return num;
    }

   public static BigInteger fibonacci(int n) {


       BigInteger f1 = BigInteger.valueOf(0);
       BigInteger f2 = BigInteger.valueOf(1);
       BigInteger f;

       int i =  1 ;

       while (i ++  < n) {

           f = f2;

           f2 = f2.add(f1);

           f1 = f;


       }

      return f2;
   }

    public static void main(String[] args) {
        BigAlgebra b=new BigAlgebra();
        System.out.println(b.fibonacci(25));
    }
}