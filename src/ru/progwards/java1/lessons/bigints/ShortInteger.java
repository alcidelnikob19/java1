package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short s;
    public ShortInteger(short s) {
        this.s=s;
    }


    @Override
    protected int toInt() {
        return this.s;
    }
}