package khai.dict.java._14_solid.interface_segregation.initial_state;

public class SimplePrinter implements OfficeMachine {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void scan() {
        // do nothing ???
    }

    @Override
    public void fax() {
        // do nothing?
    }
}
