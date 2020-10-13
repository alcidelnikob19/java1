package ru.progwards.java1.lessons.interfaces;


import java.util.Arrays;

public class ArraySort {

    public static void sort(CompareWeight[] a) {
        int indexMin;
        for (int index = 0; index < a.length; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < a.length; indexToScan++) {

                if (a[indexMin].compareWeight(a[indexToScan]) == CompareWeight.CompareResult.GREATER) {
                    indexMin = indexToScan;
                }
            }
            CompareWeight temp = a[index];
            a[index] = a[indexMin];
            a[indexMin] = temp;

        }

    }

    public static void main(String[] args) {

        Animal[] a2 = {new Cow(5000),new Duck(6),new Duck(1)};

        System.out.println(Arrays.toString(a2));

        sort(a2);

    }
}

