package khai.dict.java._06_records_and_interfaces.classes;

import khai.dict.java._06_records_and_interfaces.interfaces.Chargeable;

public class Device implements Chargeable {
    private final String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void charge() {
        System.out.println("Device " + name + " is charging...");
    }

    public void transferData() {
        System.out.println("Device " + name + " is transferring data...");
    }
}
