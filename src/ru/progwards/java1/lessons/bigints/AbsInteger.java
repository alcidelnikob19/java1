package ru.progwards.java1.lessons.bigints;
import java.math.*;

public class AbsInteger {
    static   AbsInteger  add ( AbsInteger  num1 , AbsInteger  num2 ) {
        return num1.toByte() >= num2.toByte() ? num1.add(num2) : num2.add(num1);
    }
    protected AbsInteger  add ( AbsInteger  num1 ) {
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


    public  static  void  main ( String [] args ) {
        AbsInteger num1 =  new ByteInteger ((byte) 11);
        AbsInteger num2 =  new ShortInteger (974 );
        AbsInteger num3 =  new IntInteger (94 );
        System.out.println( AbsInteger.add (num1, num2));
    }
}
