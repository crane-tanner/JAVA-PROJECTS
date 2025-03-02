import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //How many new students need to be added to DB?
        String is_true = "y";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many students will be added to the database?");
            int num_students = sc.nextInt();
            if (num_students < 0 || num_students > 10) {
                System.out.println("Number of students must be positive and less than 10.\n");
                System.out.println("Enter how many students will be added to the database?");
                num_students = sc.nextInt();
            }

            Student st1 = new Student();
            System.out.println("Do you want to continue? Type y or n");
            is_true = sc.next();
        } while(is_true.equals("y"));
    }
}