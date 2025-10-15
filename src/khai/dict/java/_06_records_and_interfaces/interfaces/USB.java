package khai.dict.java._06_records_and_interfaces.interfaces;

public interface USB extends Chargeable {
    int MAX_SPEED = 100_000;

    void transferData(String data);
}
