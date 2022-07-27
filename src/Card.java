public class Card {

    private int pinNumber;
    private int funds;

    Card (int pinNumber, int funds){
        this.pinNumber = pinNumber;
        this.funds = funds;
    }
    public int getFunds() {
        return funds;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public int withdraw(int amount) {
        this.funds -= amount;
        return funds;
    }
}