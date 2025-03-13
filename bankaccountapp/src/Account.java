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
    }
    //Set account number
    private String setAccountNumber() {
        index++;
        String lastTwoSSN = SSN.substring(7);
        int unique5digit = index;
        int randomNum = (int) (Math.random() * 1000);
        return lastTwoSSN + unique5digit + randomNum;

    }
    // List common methods

    public void printInfo() {
        System.out.println("Name: " + name + " SSN: " + SSN + " BALANCE: $" + balance);
    }

}
