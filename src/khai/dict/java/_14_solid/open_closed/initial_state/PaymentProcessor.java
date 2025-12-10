package khai.dict.java._14_solid.open_closed.initial_state;

public class PaymentProcessor {
    public void process(String method, double amount) {
        if (method.equals("credit")) {
            System.out.println("Processing credit payment by amount: " + amount);
        } else if (method.equals("debit")) {
            System.out.println("Processing debit payment by amount: " + amount);
        } else if (method.equals("magic")) {
            System.out.println("Processing magic payment by amount: " + amount);
        }
    }
}
