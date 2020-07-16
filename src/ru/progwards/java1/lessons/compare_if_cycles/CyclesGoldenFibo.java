package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    // Does number contains digit
    public static boolean containsDigit(int number, int digit) {
        if (number == 0 && digit == 0) return true;
        int n = number;
        while (n > 0) {
            if (n % 10 == digit) return true;
            n /= 10;
        }

        return false;
    }

//        boolean f = (number == digit);
//        System.out.println(f);
//        return f;


    public static int fiboNumber(int n){
        if (n < 2) {

            return n;

        } else {

            return (fiboNumber(n-1)+fiboNumber(n-2));
        }
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        float q = 0;
       if (a == b)
            q = (float)a / c;
        else if (b == c)
                q = (float)b / a;
        else if (a == c)
                    q = (float)a / b;

        return  q > 1 && q < 2;
        }


  /*       if (b == a) {
            q = 1.0*c / a;
            q > 1.0 && q < 2.0; можно так?
        }
        else if (b == c) {
            q = 1.0*a / c;}
        else if (a == c) {
            q = 1.0*b / c;}

        return q > 1.61703 && q < 1.61903;
    }
*/
    public static void main(String[] args) {
        containsDigit(1000,100);//не выводит в кс
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(55,55,55));

    }
}