package exception;

public class WrongPinCodeException  extends ATMException{
    public WrongPinCodeException() {
        super("Wrong PIN");
    }
}
