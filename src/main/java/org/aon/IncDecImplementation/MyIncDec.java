package org.aon.IncDecImplementation;

import org.aon.IncDecInterface.IncDec;

public class MyIncDec implements IncDec {
    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    public void increment() {
        this.x++;
    }

    public void decrement() {
        this.x--;
    }

    public int getValue() {
        return x;
    }
}
