package ru.progwards.java1.lessons.test;

import ru.progwards.java1.lessons.classes.Animal;

public class Main {
    //    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.set(5));
//
//    }.
    class Point2D1 {

        int x;
        int y;

        Point2D1(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + "," + y;
        }
    }

    class Point3D1 extends Point2D1 {

        int z;

        Point3D1(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

        @Override
        public String toString() {
            return super.toString() + "," + z;
        }
    }

    class Point2D {
        private int x;
        private int y;

        Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            String v = Integer.toString(x) + "," + Integer.toString(y);
            return v;
        }

    }


    class Point3D extends Point2D {
        private int z;

        Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

        @Override
        public String toString() {
            String v = super.toString() + "," + Integer.toString(z);
            return v;
        }
    }
}
   /* public static void main(String[] args) {
        Animal an= new Animal(2.1);
        System.out.println(an.weight);
    }
}*/
//    Правильные ответы: Наследование это обретение классом-потомком
//        свойств класса-родителя, Конструктор не наследуется, как другие
//        методы, Конструктор потомка всегда вызывает конструктор родителя
//
//    Правильные ответы: Наследование позволяет писать код без дублирования, Конструктор родителя вызывается из потомка
//        ключевым словом super, Аннотация @Override позволяет нам исключить ошибки в сигнатуре при переопределении методов,
//        Модификатор protected позволяет видеть свойство при наследовании класса в другом package