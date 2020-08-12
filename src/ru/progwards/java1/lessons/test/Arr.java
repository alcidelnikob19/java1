package ru.progwards.java1.lessons.test;

public class Arr {
    public static void main(String[] args) {
        boolean[] array = new boolean[100];
        int i,j;
        for (i = 2; i < 100; i++)

            for (j = i + i; j < 100; j = j + i)
                array[j] = false;
    }
}