package ru.progwards.java1.lessons.bigints;
import java.math.*;

public class AbsInteger {

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
    static   AbsInteger  add ( AbsInteger  num1 , AbsInteger  num2 ) {
        return num1.toByte() >= num2.toByte() ? num1.add(num2) : num2.add(num1);
    }


    private static class ShortInteger extends AbsInteger {
        public ShortInteger(short i) {
            super();
        }

        public ShortInteger(int i) {

        }
    }

    private static class ByteInteger extends AbsInteger {
        public ByteInteger(byte b) {
            super();
        }
    }

    public  static  void  main ( String [] args ) {
        AbsInteger num1 =  new ByteInteger ((byte) 11);
        AbsInteger num2 =  new ShortInteger (974 );
        System.out.println( AbsInteger.add (num1, num2));
    }
}
