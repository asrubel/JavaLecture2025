package khai.dict.java._07_classes_interaction;

public class Laptop {
    public String info;

    void receiveInfo(String info) {
        this.info = info;
        System.out.println(info);
    }
}
