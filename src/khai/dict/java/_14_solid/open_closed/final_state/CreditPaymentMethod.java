package khai.dict.java._14_solid.open_closed.final_state;

public class CreditPaymentMethod implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing credit payment by amount: " + amount);
    }
}
