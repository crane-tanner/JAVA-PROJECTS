public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
     private String  SSN;
     private String name;
     private double balance;
     protected String accountNumber;
     protected double rate;
     private static int index = 10000;


    //Constructor to set base properties and initialize the account
    public Account(String name, String ssn, double initDeposit) {
      SSN = ssn;
      this.name = name;
      balance = initDeposit;
      this.accountNumber = setAccountNumber();
      setRate();
    }

    public abstract void setRate();

    //Set account number
    private String setAccountNumber() {
        index++;
        String lastTwoSSN = SSN.substring(7);
        int unique5digit = index;
        int randomNum = (int) (Math.random() * 1000);
        return lastTwoSSN + unique5digit + randomNum;

    }
    // List common methods
    public void compound() {
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        balance = balance + accruedInterest;
        showBalance();
    }

    public void deposit(double amount) {
        System.out.println("Depositing $"+amount + "...");
        balance = balance + amount;
        showBalance();
    }
    public void withdraw(double amount) {
        System.out.println("Withdrawing $"+ amount + "...");
        balance = balance - amount;
        showBalance();
    }
    public void transfer(String toWhere, double amount) {
        System.out.println("Transferring $" + amount + " to " + toWhere + "...");
        balance = balance - amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void printInfo() {
        System.out.println("NAME: " + name  + "\nBALANCE: $" + balance + "\nACCOUNT NUMBER: " + accountNumber
        + "\nRate: " + rate +"%");
    }

}
