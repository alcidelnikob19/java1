package ru.progwards.java1.lessons.bigints;
import java.math.*;

public class AbsInteger {

    protected AbsInteger  add2 ( AbsInteger  num1 ) {
        return  null ;
    }
    protected byte  toByte () {
        return 0 ;
    }
    protected  short  toShort () {
        return 0 ;
    }
    protected  int  toInt () {
        return 0 ;
    }
    static   AbsInteger  add2 ( AbsInteger  num1 , AbsInteger  num2 ) {
        return num1.toByte() >= num2.toByte() ? num1.add2(num2) : num2.add2(num1);
    }

    public  static  void  main ( String [] args ) {
        AbsInteger num1 =  new ByteInteger ((byte) 11);
        AbsInteger num2 =  new ShortInteger (974 );
        AbsInteger num3 =  new IntInteger (94 );
        System.out.println( AbsInteger.add2 (num1, num2));
    }
}
