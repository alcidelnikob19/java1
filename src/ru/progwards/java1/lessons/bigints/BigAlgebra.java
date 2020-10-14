package ru.progwards.java1.lessons.bigints;

import java.math.*;

public class BigAlgebra {
    BigDecimal fastPow(BigDecimal num, int pow) {

        return num;
    }

    BigInteger fibonacci(int n) {
        if (n < 2) {

            return BigInteger.valueOf(n);

        } else {

            BigInteger i = fibonacci(n - 2).add(fibonacci(n - 1));
        }
        return null;
    }

    public static void main(String[] args) {
        BigAlgebra b=new BigAlgebra();
        b.fibonacci(25);
    }
}