package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int i;
    public IntInteger(int i) {
        this.i=i;
    }
//
//    @Override
//    protected int toInt() {
//        return 0;
//    }


    @Override
    protected int toInt() {
        return this.i;
    }
}

