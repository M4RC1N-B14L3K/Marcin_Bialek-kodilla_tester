import java.util.Scanner;
public class UserColors {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Please choose first letter of color:");
            System.out.println("1. G");
            System.out.println("2. R");
            System.out.println("3. B");
            System.out.println("4. Y");
            System.out.println("5. Close");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case  1 : System.out.println("You choose Green");
                case  2 : System.out.println("You choose Red");
                case  3 : System.out.println("You choose Black");
                case  4 : System.out.println("You choose Yellow");
                case  5 : shouldContinue = false;
            }
        }
    }
}