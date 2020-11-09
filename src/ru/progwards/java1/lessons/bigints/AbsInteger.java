package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {

    protected abstract int toInt();

    static AbsInteger  add ( AbsInteger  num1 , AbsInteger  num2 ) {
        int add2=num1.toInt()+num2.toInt();
    if (add2<=Byte.MAX_VALUE&&add2>=Byte.MIN_VALUE) return new ByteInteger((byte)add2);
    else if (add2<=Short.MAX_VALUE && add2>=Short.MIN_VALUE) return  new ShortInteger((short)add2);
    else return  new IntInteger(add2);
    }

    public  static  void  main ( String [] args ) {
        AbsInteger num1 =  new  ByteInteger (( byte ) 10 );
        AbsInteger num2 =  new  ByteInteger (( byte ) 10 );;
        System.out.println(AbsInteger.add(num1, num2));
    }
}


