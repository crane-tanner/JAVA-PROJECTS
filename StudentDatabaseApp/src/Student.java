import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuition_balance = 0;
    private static final int COST_PER_COURSE = 600;
    private static int id = 1000;

// Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the student first name: " + "\n");
        firstName = in.nextLine();
        System.out.print("Enter the student last name: " + "\n");
        lastName = in.nextLine();
        System.out.println("1 - freshman\n2 - sophomore\n3 - junior\n4 - senior\nEnter student year: ");
        gradeYear = in.nextLine();
        setStudentID();

    }
    //Generate an ID
    private void setStudentID() {
        // Grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter a course to enroll. (Q to quit) ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!Objects.equals(course, "Q")) {
                courses = courses + "\n" +  course;
                tuition_balance = tuition_balance + COST_PER_COURSE;
            } else {
                break;
            }
        } while(1 != 0);
    }
    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuition_balance);
    }
    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter amount to pay: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuition_balance = tuition_balance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }
    // show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\n" + "Courses Enrolled: " + courses + "\n" +
                "Grade Level: " + gradeYear + "\n" + "Student ID: " + studentID + "\nBalance: $" + tuition_balance;


    }
}
