public class Main {
    public static void main(String[] args) {

        Email em1 = new Email("John", "Michael");
        System.out.println(em1.getPassword());
        System.out.println(em1.printInfo());
        System.out.println();
        Email em2 = new Email("Sarah", "Morgan");
        System.out.println(em2.getPassword());
        System.out.println(em2.printInfo());


    }
}