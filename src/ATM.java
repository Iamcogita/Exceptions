import exception.InputCardException;
import exception.NegativeNumbersException;
import exception.NoMoneyException;
import exception.WrongPinCodeException;

public class ATM {
    private Card card;
    private boolean hasCard;
    private boolean isPinCorrect;

    public void inputCard(Card card) {
        this.card = card ;
        hasCard = true;
        System.out.print("Card inserted: \n -- input pin -- \n"  );
    }
    public void authenticate( int pinNumber) {
        try{ if(!hasCard){
            throw new InputCardException();
        }
        } catch (InputCardException e) {
            System.out.println(e.getMessage());
            return;
        }
        try{ if (card.getPinNumber() != pinNumber){
            throw new WrongPinCodeException();
        }
        } catch (WrongPinCodeException e) {
            System.out.println(e.getMessage());
            return;
        }
        isPinCorrect = true;
        System.out.println("How much do you want to withdraw?");
    }
    public void withdrawal(int amount) {
        try { if (amount < 0) {
              throw new NegativeNumbersException();
        }
        } catch (NegativeNumbersException e) {
            System.out.println(e.getMessage());
            return;
        }
        try{ if(!isPinCorrect){
            throw new WrongPinCodeException();
       }
       } catch (WrongPinCodeException e) {
        System.out.println(e.getMessage());
        return;
        }
       try{ if ( card.getFunds() - amount < 0){
            throw new NoMoneyException();
       }
       } catch (NoMoneyException m) {
           System.out.println(m.getMessage());
           return;
       }
       card.withdraw(amount);
       System.out.println( amount + "€");
       System.out.println("Your account balance is : " + card.getFunds() + "€");
    }
}