package khai.dict.java._08_exceptions;

public class TooHighValueException extends Exception {
    public TooHighValueException(String message) {
        super(message);
        System.out.println("Inside the TooHighValueException");
    }
}
