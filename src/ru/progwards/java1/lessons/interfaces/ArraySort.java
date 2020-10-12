package ru.progwards.java1.lessons.interfaces;


//public static void sort(int[] a){
//
//
//        //проходим по массиву
//        //Найти минимальный элемент
//        //меняем местами 1 и минимальный элемент
//
//        //повторяем пока не пройхоме по всему массиву
//        int indexMin;
//        for (int index = 0; index < a.length ; index++){
//        indexMin = index;
//        for (int indexToScan = index; indexToScan < a.length; indexToScan++) {
//        if (a[indexMin] > a[indexToScan]) {
//        indexMin = indexToScan;
//        }
//        }
//        int temp = a[index];
//        a[index] = a[indexMin];
//        a[indexMin]=temp;
//
//        }
//        System.out.println(Arrays.toString(a));
//        }
//public static void main(String[] args) {
//        int[] unsortedArray = {2,1,45,7};
//
//        System.out.println(Arrays.toString(unsortedArray));
//
//        sort(unsortedArray);
//        }
        public class ArraySort {

            public static void sort(CompareWeight[] a) {
                int indexMin;
                for (int index = 0; index < a.length ; index++){
                    indexMin = index;
                    for (int indexToScan = index; indexToScan < a.length; indexToScan++) {
//                        public CompareWeight.CompareResult compareWeight(CompareWeight smthHasWeigt) {
//                            Food food = (Food) smthHasWeigt;
//
//                            if (this.weight < food.weight) return CompareWeight.CompareResult.LESS;
//                            if (this.weight == food.weight) return CompareWeight.CompareResult.EQUAL;
//                            return CompareWeight.CompareResult.GREATER;
//
//                        }
                        if (a[indexMin] > a[indexToScan]) {
                            indexMin = indexToScan;
                        }
                    }
                    CompareWeight temp = a[index];
                    a[index] = a[indexMin];
                    a[indexMin]=temp;

                }

            }
        }

