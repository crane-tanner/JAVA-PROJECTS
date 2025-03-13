public class Saving extends Account {
    //List properties specific to Savings account
    int safety_deposit_boxID;
    int safety_deposit_boxKEY;

    //Constructor to initialize settings
    public Saving(String name,String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("SAVINGS ACCOUNT CREATED");
        System.out.println("ACCOUNT NUMBER: " + accountNumber);
    }
    // List any methods specific to savings account
}
