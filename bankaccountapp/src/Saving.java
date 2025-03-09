public class Saving extends Account {
    //List properties specific to Savings account
    int safety_deposit_boxID;
    int safety_deposit_boxKEY;

    //Constructor to initialize settings
    public Saving(String name) {
        super(name);
        System.out.println("SAVINGS ACCOUNT CREATED");
    }
    // List any methods specific to savings account
}
