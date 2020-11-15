//package ru.progwards.java1.lessons.test;
//import java.math.BigInteger;
//import java.util.Arrays;
//
//public class ArrayInteger
//{
//    private byte[] digits;//приватная переменная дижитс типа байт
//
//    private boolean sign;//приватная переменная сигн типа булиан
//
//    public byte getDigit(int n) // метод гетДижит возвращает значение типа байт
//    {
//        return n >= 0 && n < digits.length ? digits[n] : 0;
//    }
//
//    public int getArrayLength()
//    {
//        return digits.length;
//    }
//
//    public boolean isSign()
//    {
//        return sign;
//    }
//
//    public ArrayInteger(int n)
//    {
//        digits = new byte[n];
//        sign = true;
//    }
//
//    void debugPrint()
//    {
//        System.out.println("Length = " + digits.length + ",    Sign = " + sign);
//        System.out.println(Arrays.toString(digits));
//    }
//
//    public void fromInt(BigInteger value)
//    {
//        int i = 0;
//        BigInteger[] arr = {value.abs(), BigInteger.ZERO};
//        sign = value.compareTo(BigInteger.ZERO) >= 0;
//
//        while ((i < digits.length) && (arr[0].compareTo(BigInteger.TEN) >= 0))
//        {
//            arr = arr[0].divideAndRemainder(BigInteger.TEN);
//            digits[i] = arr[1].byteValue();
//            i++;
//        }
//
//        if (i < digits.length)
//            digits[i] = arr[0].byteValue();
//
//    }
//
//    public BigInteger toInt()
//    {
//        BigInteger res = BigInteger.valueOf(digits[0]);
//        BigInteger p = BigInteger.ONE;
//
//        for (int i = 1; i < digits.length; i++)
//        {
//            p = p.multiply(BigInteger.TEN);
//            res = res.add(p.multiply(BigInteger.valueOf(digits[i])));
//        }
//
//        if (sign == false)
//            res = res.multiply(BigInteger.valueOf(-1));
//
//        return res;
//    }
//
//    public boolean add(ArrayInteger num)
//    {
//        if (digits.length < num.getArrayLength())
//        {
//            Arrays.fill(digits, (byte) 0);
//            sign = true;
//            return false;
//        }
//
//        byte o = 0;
//        for (int i = 0; i < digits.length; i++)
//        {
//            digits[i] = (byte) (digits[i] + num.getDigit(i) + o);
//            if (digits[i] > 9)
//            {
//                digits[i] = (byte) (digits[i] - 10);
//                o = 1;
//            } else
//                o = 0;
//        }
//
//        if (o == 0)
//            return true;
//
//        Arrays.fill(digits, (byte) 0);
//        sign = true;
//        return false;
//    }
//
//    public static void main(String[] args)
//    {
//        ArrayInteger a = new ArrayInteger(15);
//        a.fromInt(new BigInteger("100000000000"));
//        a.debugPrint();
//
//        System.out.println(a.toInt().toString());
//
//        ArrayInteger b = new ArrayInteger(7);
//        b.fromInt(new BigInteger("6789610"));
//        b.debugPrint();
//
//        ArrayInteger c = new ArrayInteger(24);
//        c.fromInt(new BigInteger("722337203698989580746085"));
//        c.debugPrint();
//
//        System.out.println(b.add(c));
//        b.debugPrint();
//
//
//    }
//
//}