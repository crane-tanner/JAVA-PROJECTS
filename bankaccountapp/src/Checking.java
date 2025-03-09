public class Checking extends Account {
    //List properties specific to a checking account
    int card_PIN;
    int debitCardNumber;

    //Constructor to initialize checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("CHECKING ACCOUNT CREATED");
    }

    // List any methods specific to the checking account

}
