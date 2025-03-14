public class Main {
    //Bank account Application
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Kai Lang", "554898412", 3000);
        chkacc1.printInfo();
        System.out.print("******************************\n");
        Saving savacct1 = new Saving("Sarah Morgan", "123210958", 250);
        savacct1.printInfo();
        System.out.println();

        savacct1.deposit(3000);
        savacct1.withdraw(700);
        savacct1.transfer("Loan", 1500);


      //Read a CSV file then create new accounts based on that data

    }
}