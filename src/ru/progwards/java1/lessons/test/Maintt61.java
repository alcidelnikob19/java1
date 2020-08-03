package ru.progwards.java1.lessons.test;

/*public class Maintt61 {
    public static int sumArrayItems(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];

        }
        return s;

    }
}
*/
class Rectangle {
    private static double a;
    private static double b;

    //double a;
    //double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double area() {

        return a * b;
    }



    Rectangle anRectangle(double a, double b) {

        return new Rectangle(a, b);
    }

    public int compareTo( Rectangle anRectangle) {
        double s1 = Rectangle.area();
        double s2 = anRectangle.area();
        return s1 >= s2 ? (s1 == s2 ? 0 : 1) : -1;
        //return s1>=s2?(s1==s2?0:1):-1;

    }


    public static void main(String[] args) {
        System.out.println(new Rectangle(2,3).compareTo(new Rectangle(3, 2)));
        System.out.println(new Rectangle(33,30).compareTo(new Rectangle(2, 20)));

    }


}
