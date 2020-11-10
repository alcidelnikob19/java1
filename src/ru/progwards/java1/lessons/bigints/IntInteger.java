package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int i;
    public IntInteger(int i) {
        this.i=i;
    }
    @Override
    protected int toInt() {
        return this.i;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}


