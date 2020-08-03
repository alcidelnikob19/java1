package ru.progwards.java1.lessons.test;

public class Point2D {

    private int x,y;
    public Point2D(int x,int y) {
        this.x = x;
        this.y = y;
          }
    public String toString() {
        return x+ ","+y;
    }
    public static void main(String[] args) {
        Point2D p=new Point2D(5,5);

        System.out.println(p.toString());

    }
}