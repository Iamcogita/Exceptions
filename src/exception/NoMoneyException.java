package exception;

public class NoMoneyException extends ATMException{

    public NoMoneyException() {
        super("Not enough funds");
    }
}
