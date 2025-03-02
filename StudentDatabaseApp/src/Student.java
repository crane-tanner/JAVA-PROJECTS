import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses;
    private int tuition_balance;
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
        System.out.println(firstName + " " + lastName + "\n" + "Grade level: " + gradeYear);
        System.out.println("Student ID: " + setStudentID());

    }
    //Generate an ID
    private String setStudentID() {
        // Grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
        return this.studentID;
    }
    // Enroll in courses
    //View balance
    // Pay tuition
    // show status
}
