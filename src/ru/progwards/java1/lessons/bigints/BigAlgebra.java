package ru.progwards.java1.lessons.bigints;

import java.math.*;

public class BigAlgebra {
   public static BigDecimal fastPow(BigDecimal num, int pow) {
       BigDecimal result = BigDecimal.valueOf(1);
       for (int i=1; i<=pow; i++){

           result = result.multiply(num);

       }
       return result;
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
        b.fastPow(BigDecimal.valueOf(2),43);
        BigAlgebra.fastPow(BigDecimal.valueOf(2),43);
        b.fastPow(BigDecimal.valueOf(25),2);
        System.out.println(b.fastPow(BigDecimal.valueOf(2),43));





    }
}