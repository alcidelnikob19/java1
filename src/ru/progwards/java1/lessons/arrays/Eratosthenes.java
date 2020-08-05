package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;
public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N){
        sieve = new boolean[N+1];
        Arrays.fill(sieve, true);
        sift();
    }
    private void sift(){
        int i,j;
        for (i = 2; i < 100; i++)

            for (j = i + i; j < 100; j = j + i)
                sieve[j] = false;
    }

    public boolean isSimple(int n){

        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes er = new Eratosthenes(100);
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " " + er.isSimple(i));
        }
    }
}