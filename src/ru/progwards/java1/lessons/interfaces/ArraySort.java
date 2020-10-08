package ru.progwards.java1.lessons.interfaces;


import java.util.Arrays;

public class ArraySort {

    public static void sort(int[] a){

        int indexMin;
        for (int index = 0; index < a.length ; index++){
            indexMin = index;
            for (int indexToScan = index; indexToScan < a.length; indexToScan++) {
                if (a[indexMin] > a[indexToScan]) {
                    indexMin = indexToScan;
                }
            }
            int temp = a[index];
            a[index] = a[indexMin];
            a[indexMin]=temp;

        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] unsortedArray = {2,1,45,7};

        System.out.println(Arrays.toString(unsortedArray));

        sort(unsortedArray);
    }
}