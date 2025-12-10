package khai.dict.java._14_solid.open_closed.final_state;

public class DebitPaymentMethod implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing debit payment by amount: " + amount);
    }
}
