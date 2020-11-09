package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    byte b;
    public ByteInteger(byte b) {
        this.b=b;
    }

    @Override
    protected int toInt() {
        return this.b;
    }

    @Override
    public String toString() {
        return "ByteInteger{" +
                "b=" + b +
                '}';
    }
}
