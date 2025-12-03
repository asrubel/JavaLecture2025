package khai.dict.java._13_multithreading;

public class Counter {
    private int value = 0;

    public void increment() {
        for (int i = 0; i < 1_000_000; i++) {
            value++;
        }
    }

    public int getValue() {
        return value;
    }
}
