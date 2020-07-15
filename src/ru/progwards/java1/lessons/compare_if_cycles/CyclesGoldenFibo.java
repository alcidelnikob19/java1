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
        double q = 0;
       if (b == a) {
            q = 1.0*c / a;}
        else if (b == c) {
                q = 1.0*a / c;}
        else if (a == c) {
                    q = 1.0*b / c;}

        return q > 1.0 && q < 2.0;
        }

  /*       if (b == a) {
            q = 1.0*c / a;
            q > 1.0 && q < 2.0; можно так?
        }
        else if (b == c) {
            q = 1.0*a / c;}
        else if (a == c) {
            q = 1.0*b / c;}

        return q > 1.0 && q < 2.0;
    }
*/
    public static void main(String[] args) {
        containsDigit(1,100);
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(5,5,9));

    }
}