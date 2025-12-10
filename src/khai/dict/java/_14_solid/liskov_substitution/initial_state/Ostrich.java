package khai.dict.java._14_solid.liskov_substitution.initial_state;

public class Ostrich extends Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}
