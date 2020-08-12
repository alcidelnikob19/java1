package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {

    // возвращает значение бита с порядковым номером bitNumber от параметра value
    public static int checkBit(byte value, int bitNumber) {
        return value >> bitNumber & 1;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte)0b0000_0000, 7));
        System.out.println(checkBit((byte)0b1000_0000, 0));
        System.out.println(checkBit((byte)0b0000_0000, 4));
        System.out.println(checkBit((byte)0b0001_0000, 4));
        System.out.println(checkBit((byte)0b1000_0000, 4));
        System.out.println(checkBit((byte)0b1001_0000, 4));
    }

}