import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "hehehe";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("h");

        System.out.printf("name length: %d\n",length);;
        System.out.printf("char letter: %c\n",letter);
        System.out.printf("Name index: %d\n",index);
        System.out.printf("Last index: %d",lastIndex);

        scanner.close();
    }
}