import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //How many new students need to be added to DB?
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many students will be added to the database?");
            int num_students = sc.nextInt();
            Student[] students = new Student[num_students];

           for(int n = 0; n < students.length; n++) {
               students[n] = new Student();
               students[n].enroll();
               students[n].payTuition();

           }
           for(int n = 0; n < num_students; n++) {
               System.out.println(students[n].showInfo());
           }

    }
}