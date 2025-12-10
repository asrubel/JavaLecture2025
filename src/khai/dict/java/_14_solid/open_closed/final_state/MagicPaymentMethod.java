package khai.dict.java._14_solid.open_closed.final_state;

public class MagicPaymentMethod implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing magic payment by amount: " + amount);
    }
}
