public class Checking extends Account {
    //List properties specific to a checking account
    private int card_PIN;
    private int debitCardNumber;

    //Constructor to initialize checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        setDebitCard();
    }

    // List any methods specific to the checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        card_PIN = (int) (Math.random() * 10000);
    }
    @Override
    public void setRate() {
        rate = getBaseRate()*.15;
    }

    @Override
    public void printInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.printInfo();
        System.out.println("Checking Account Features: " + "\n Debit Card Number: " + debitCardNumber + "\n PIN: " +
                card_PIN);
    }

}
