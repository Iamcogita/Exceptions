package exception;

public class NegativeNumbersException extends ATMException{
    public NegativeNumbersException () {
        super("Positive numbers only.");
    }
}
