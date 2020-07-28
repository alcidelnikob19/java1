package ru.progwards.java1.lessons.classes;

public class ComplexNum {
int a;
int b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public ComplexNum newComplexNum(int a, int b) {
        return new ComplexNum(a, b);
    }
    public String toString(){
        return a+"+"+b+"i";
    }

    public ComplexNum add(ComplexNum num) {
        int a1, b1;
        a1 = this.a + num.a;
        b1 = this.b + num.b;
        return new ComplexNum(a1, b1);

    }


    // test
    public static void main(String[] args) {
        ComplexNum c= new ComplexNum(1, 56);
        ComplexNum a = new ComplexNum(2, 2);
        ComplexNum b = new ComplexNum(1, 1);
        System.out.println(c.toString());
        ComplexNum c5= a.add(b);

    }
}
/*
// сложение комплексных чисел по формуле: (a + bi) + (c + di) = (a + c) + (b + d)i
// public ComplexNum add(ComplexNum num1, ComplexNum num2) {
//      return new ComplexNum(num1.a + num2.a, num1.b + num2.b);
//  }
// вычитание комплексных чисел по формуле: (a + bi) - (c + di) = (a - c) + (b - d)i
public ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a - num2.a, num1.b - num2.b);
        }
// умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
public ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum(a * c - b * d, b * c + a * d);
         }

             //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }



         //   System.out.println(a.sub(a, b));
        //System.out.println(a.mul(a, b));
       // System.out.println(a.div(a, b));
 */

/*
public class ComplexNum {
    public int a;
    public int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(this.a + num.a, b + num.b);
    }

    public void info() {
        System.out.println("this.a = " + a);
        System.out.println("this.b = " + b);
        System.out.println();
    }

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(1, 2);
        ComplexNum c2 = new ComplexNum(2, -1);
        ComplexNum c3= new ComplexNum(3, 3);
        ComplexNum c4= new ComplexNum(4, -2);

        ComplexNum c5= c1.add(c2);

        c1.info();
        c2.info();

        c5.info();
    }
}
*/