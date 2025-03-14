public class Saving extends Account {
    //List properties specific to Savings account
    private int safety_deposit_boxID;
    private int safety_deposit_boxKEY;

    //Constructor to initialize settings
    public Saving(String name,String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safety_deposit_boxID = (int) (Math.random()* 1000);
        safety_deposit_boxKEY= (int) (Math.random() * 10000);

    }

    @Override
    public void printInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.printInfo();
        System.out.println("Savings Account Features: " + "\n SAFETY DEPOSIT BOX ID: " +
                safety_deposit_boxID + "\n SAFETY DEPOSIT BOX KEY: " + safety_deposit_boxKEY);
    }
}
