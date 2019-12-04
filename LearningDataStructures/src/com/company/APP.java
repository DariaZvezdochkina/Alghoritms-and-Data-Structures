package com.company;

import ADT_abstractDataTypes.Counter;

public class APP {

    public static void main(String[] args) {
        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());
    }
}
