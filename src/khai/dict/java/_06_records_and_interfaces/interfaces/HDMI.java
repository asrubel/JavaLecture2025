package khai.dict.java._06_records_and_interfaces.interfaces;

public interface HDMI {
    void display();

    default void showManufacturer() {
        System.out.println("Unknown manufacturer");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }
}
