public class Main {
    public static void main(String[] args) {

        ATM atm1 = new ATM();
        Card card1 = new Card( 7777, 100);

        atm1.inputCard(card1);
        atm1.authenticate(7777);
        atm1.withdrawal(40);

    }
}