import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("What is yout gpa :");
        double GPA = scanner.nextDouble();

        System.out.println("Are you a student :");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is :" + GPA);
        if (isStudent) {
            System.out.println("You have enrolled");
        }
        else {
            System.out.println("You are NOT enrolled");
        }
        scanner.close();
    }
}