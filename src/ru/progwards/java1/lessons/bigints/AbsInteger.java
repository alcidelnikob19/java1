package ru.progwards.java1.lessons.bigints;

import ru.progwards.java1.lessons.arrays.DIntArray;

public abstract class AbsInteger {
    static  AbsInteger i;
    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        AbsInteger i;
        i = num1.add(num2);

        return i;
    }

    private AbsInteger add(AbsInteger num2) {
        return num2;
    }


    public static void main(String[] args) {
        AbsInteger num1 = new ByteInteger((byte) 65);
        AbsInteger num2 = new ByteInteger((byte) 65);
        AbsInteger num3 = new IntInteger(94);

        System.out.println(AbsInteger.add(num1, num2));
    }

    protected abstract int toInt();
}

