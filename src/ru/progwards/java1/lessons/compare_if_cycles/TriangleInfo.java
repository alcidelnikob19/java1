package ru.progwards.java1.lessons.compare_if_cycles;

public class  TriangleInfo {

    public static boolean isTriangle(int a, int b, int c) {
        boolean f = (a + b > c && a + c > b && b + c > a);
        System.out.println(f);
        return f;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        boolean f1 = (b*b + a*a ==c*c || a * a + c * c == b * b || b*b + c * c == a * a);
        System.out.println(f1);
        return f1;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean f2 = ( b == a || c == b || c ==a);
        System.out.println(f2);
        return f2;
    }

    public static void main (String[]args){
        isTriangle(1, 5, 1);
        isRightTriangle(4, 3, 2);
        isIsoscelesTriangle(4, 5, 3);
    }
}