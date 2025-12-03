package khai.dict.java._13_multithreading;

public class SomeThread extends Thread {
    private MyClass myClass;

    public SomeThread(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.doSomething();
    }
}
