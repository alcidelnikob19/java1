package ru.progwards.java1.lessons.interfaces;


public  class  ArraySort  {

    // public static void sort (Comparable [] a) {++
    public static void sort(CompareWeight[] a){
        int indexMin;
        for (int index = 0; index < a.length ; index++){
            indexMin = index;
            for (int indexToScan = index; indexToScan < a.length; indexToScan++) {
//                if (a[indexMin] > a[indexToScan]) {
//                    indexMin = indexToScan;
//                }
            }
            CompareWeight temp = a[index];
            a[index] = a[indexMin];
            a[indexMin]=temp;

        }
    }
}
