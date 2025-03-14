public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
     String  SSN;
     String name;
     double balance;
     String accountNumber;
     double rate;
     static int index = 10000;


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
    public void deposit(double amount) {
        System.out.println("Depositing $"+amount + "...");
        balance = balance + amount;
        showBalance();
    }
    public void withdraw(double amount) {
        System.out.println("Withdrawing $"+amount + "...");
    balance = balance - amount;
    showBalance();
    }
    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere + "...");
        showBalance();
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void printInfo() {
        System.out.println("NAME: " + name  + "\nBALANCE: $" + balance + "\nACCOUNT NUMBER: " + accountNumber
        + "\nRate: " + rate +"%");
    }

}
