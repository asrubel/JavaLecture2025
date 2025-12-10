package khai.dict.java._14_solid.liskov_substitution.final_state;

public class Duck implements FlyableBird {

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}