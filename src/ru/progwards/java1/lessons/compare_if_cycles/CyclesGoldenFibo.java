package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        boolean f = (number == digit);
        System.out.println(f);
        return f;
    }

    public static int fiboNumber(int n){
        if (n < 2) {

            return n;

        } else {

            return (fiboNumber(n-1)+fiboNumber(n-2));
        }
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        double q;
        if (b == a) {
            q = 1.0*c / a;
            if (q > 1 && q < 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        containsDigit(1,100);
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(5,5,9));

    }
}
