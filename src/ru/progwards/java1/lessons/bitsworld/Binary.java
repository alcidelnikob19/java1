package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    int num;

    Binary(int num){
        this.num = num;
    }

//     возвращает двоичное представление целого числа используя только битовые операции
     public String toString() {
         int i = 0;
         String res = "";
        while (i < 8) {

            int bit = CheckBit.checkBit((byte) num, i);
            if (bit == 1)
                res ="1"+res;//res=res+"1";
            else
                res ="0"+res;
            i++;
        }
            return res;
     }


    public static void main(String[] args) {
        int t = 0;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = 1;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = 127;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = 128;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = -1;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
    }

}
