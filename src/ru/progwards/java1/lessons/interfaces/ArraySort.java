package ru.progwards.java1.lessons.interfaces;


//public  class  ArraySort {
//
//    public static void sort(CompareWeight[] a) {
//        int indexMin;
//        for (int index = 0; index < a.length ; index++){
//            indexMin = index;
//            for (int indexToScan = index; indexToScan < a.length; indexToScan++) {
////                if (a[indexMin] > a[indexToScan]) {
////                    indexMin = indexToScan;
////                }
//            }
//            CompareWeight temp = a[index];
//            a[index] = a[indexMin];
//            a[indexMin]=temp;
//
//        }
//    }
//}
        public class ArraySort {

            // public static void sort (Comparable [] a) {
            public static void sort(Comparable<Animal>[] a) {
                Comparable tmpValue;
                for (int i = a.length - 1; i > 0; i--) {
                    // найдем в остатках максимальный
                    for (int j = 0; j < i; j++) {
                        // if (a [j] .compareTo (a [i])> 0) {
                        if (a[j].compareTo((Animal) a[i]) > 0) {
                            tmpValue = a[i];
                            a[i] = a[j];
                            a[j] = tmpValue;
                        }
                    }
                }
            }
        }

