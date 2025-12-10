package khai.dict.java._14_solid.interface_segregation.final_state;

public class MultiFunctionPrinter implements Fax, Scanner, Printer {
    public void print() {
        System.out.println("print");
    }

    public void scan() {
        System.out.println("scan");
    }

    public void fax() {
        System.out.println("fax");
    }
}
