package khai.dict.java._05_access_modifiers;

import khai.dict.java._04_objects_vs_classes.SportCar;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("Ferrari", 2, 7, "4567");
        System.out.println(sportCar.model);
        //sportCar.drive();

        Jeep jeep = new Jeep("Mercedes", 4, 8, "6767");
        System.out.println(jeep.model);
        //jeep.drive();
        jeep.driveInDirt();

        BigVehicle bigVehicle = new BigVehicle("CAT", 1, 48, "6967");
        System.out.println(bigVehicle.model);
    }
}
