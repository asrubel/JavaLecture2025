package khai.dict.java._14_solid.liskov_substitution.initial_state;

public class Duck extends Bird {
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}