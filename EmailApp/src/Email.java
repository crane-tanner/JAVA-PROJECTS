import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String companySuffix = "javatek.com";
    private String email;
    private String alternateEmail;

    // Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        // Call a method that returns a password
        this.password = randomPassword(10);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase()  + "."+ companySuffix;
    }
     // Ask for the department
private String setDepartment() {
        System.out.print("New Employee: " + firstName + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if(depChoice == 1) {
            return "Sales";
        }
        else if (depChoice == 2) {
            return "Dev";
        }
        else if(depChoice == 3) {
            return "Accounting";
        }
        else {
            return "";
        }

}
    //Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    // Set the alternate email
public void setAltEmail(String altEmail) {
    this.alternateEmail = altEmail;
}
// Change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {System.out.print("Mailbox capacity: "); return mailBoxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {System.out.print("Password: "); return password;}

    public String getName() {
        return "Employee Name: " + firstName + " " + lastName;
    }
public int getMailboxCap() {
        System.out.print("Current mailbox capacity is: ");
        return mailBoxCapacity;
}
public String getEmail() {
        System.out.print("Employee Email: ");
    return email;
}
public String getDepartment() {
        System.out.print("Employee department: ");
        return department;
}
public String printInfo() {
        return "Employee Name: " + firstName + " " + lastName + "\n" + "Employee Email: " + email + "\n"
                + "Mailbox capacity: " + mailBoxCapacity + "mb";
}
}



