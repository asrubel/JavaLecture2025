package khai.dict.java._06_records_and_interfaces.classes;

import khai.dict.java._06_records_and_interfaces.interfaces.USB;
import khai.dict.java._06_records_and_interfaces.interfaces.WiFi;

public class SmartPhone implements USB, WiFi {
    @Override
    public void transferData(String data) {
        System.out.println("Transfer data form the mobile device: " + data);
    }

    @Override
    public void charge() {
        System.out.println("Charging the mobile device...");
    }

    @Override
    public void transmitData(String data) {
        System.out.println("Transmit data form the mobile device: " + data);
    }
}
