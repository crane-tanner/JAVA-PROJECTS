public class Checking extends Account {
    //List properties specific to a checking account
    int card_PIN;
    int debitCardNumber;

    //Constructor to initialize checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("CHECKING ACCOUNT CREATED");
        System.out.println("ACCOUNT NUMBER: " + accountNumber);

    }

    // List any methods specific to the checking account

}
