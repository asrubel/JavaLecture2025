package khai.dict.java._14_solid.interface_segregation.initial_state;

public class MultiFunctionPrinter implements OfficeMachine {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }

    @Override
    public void fax() {
        System.out.println("Fax");
    }
}
