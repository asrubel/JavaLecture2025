package khai.dict.java._05_access_modifiers;

import khai.dict.java._04_objects_vs_classes.Car;

public class Jeep extends Car {
    public Jeep(String model, int passengers, double weight, String plateNumber) {
        super(model, passengers, weight, plateNumber);
    }

    public void driveInDirt() {
        //drive();
        System.out.println("Jeep driving in dirt");
        System.out.println(model);
        System.out.println(passengers);
    }
}
