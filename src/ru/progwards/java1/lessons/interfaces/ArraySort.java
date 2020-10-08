package ru.progwards.java1.lessons.interfaces;


public  class  ArraySort implements CompareWeight  {

    // public static void sort (Comparable [] a) {
    public  static  void  sort ( Comparable < Animal > [] a ) {
        Comparable animal2;
        // найдем в остатках максимальный
        for ( int i = a . length -  1 ; i >=  0 ; i -- )
            for (int j = 0; j < i; j++) {
                // if (a [j] .compareTo (a [i])> 0) {
                if (a[j].compareTo((Animal) a[i]) > 0) {
                    animal2= a[i];
                    a[i] = a[j];
                    a[j] = animal2;
                }
            }
    }


    public  static  void  main ( String [] args ) {
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }
}