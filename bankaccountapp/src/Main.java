import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    //Bank account Application
    public static void main(String[] args) throws IOException {
        List<Account> accounts = new LinkedList<Account>();


      //Read a CSV file then create new accounts based on that data
        String file = "C:\\Users\\HP\\OneDrive\\Documents\\Desktop\\NewBankAccounts.csv";
        List<String[]> newCustomers = CSV.read(file);
        for(String[] customer : newCustomers){
            String name = customer[0];
            String ssn = customer[1];
            String accountType = customer[2];
            double initDeposit = Double.parseDouble(customer[3]);
            //System.out.println(name + " " + ssn + " " + accountType + " $" +initDeposit );
            if(accountType.equals("Savings")) {
                accounts.add(new Saving(name, ssn, initDeposit));
            }
            else if(accountType.equals("Checking")) {
                accounts.add(new Checking(name, ssn, initDeposit));
            }
            else {
                System.out.println("Error reading account type");
            }
        }
        for(Account account : accounts) {
            account.printInfo();
            System.out.println();
        }

    }
}