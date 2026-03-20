import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "HEhehehe";
        char firstLetter = 'H';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name start with a %c\n",firstLetter);
        System.out.printf("You re %d years old\n",age);
        scanner.close();
    }
}