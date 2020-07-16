package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        if (a > c || a > b) {
            System.out.println(a);
            return a;
        }
        if (b > c || b > c) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(c);
            return c;
        }

    }
    public static int minSide(int a, int b, int c) {
        if (a < c && a < c) {
            System.out.println(b);
            return a;
        }

        if (b < c && b < c) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(c);
            return c;
        }

    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {//почему др цвет?
        if (a == (c = b)) {
            System.out.println("True");

        } else {
            System.out.println("false");

        }
        return false;
    }


    public static void main(String[] args) {
        maxSide(3,6,8);
        minSide(2, 4, 5);
        isEquilateralTriangle(5, 5, 5);
    }
}
