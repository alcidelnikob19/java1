package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class ArraySort {
//    2.1 Реализовать метод, сортирующий произвольный массив целых чисел:

//    public static void sort(int[] a), по следующему алгоритму:

//            1. Берем первый элемент и сравниваем его со вторым, если второй меньше, меняем элементы в массиве местами.
//            2. Далее, сравниваем первый элемент с третьим, и если третий меньше, меняем их местами.
//            3. Так делаем для всех элементов с индексом больше первого
//4. Берем второй элемент и сравниваем его с третьим, если нужно, меняем местам
//5. Далее сравниваем второй элемент с четвертым, и если нужно, меняем местами.
//6. Делаем так для всех элементов, с индексом больше 2-го
//7. Переходим к элементу с индексом 3...
//            8. Обобщая, алгоритм звучит следующим образом - сделать 2 вложенных цикла, внешний по i и внутренний по j.

    //чтобы исключить множественное обращение к .length буду сортировать от большего к меньшему
    //чтобы избежать множественных перезаписей элементов, заведу переменную, содержащую максимальный элемент
    //и значение этого элемента



    public static void sort(int[] a){


        //проходим по массиву
        //Найти минимальный элемент
        //меняем местами 1 и минимальный элемент

        //повторяем пока не пройхоме по всему массиву
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