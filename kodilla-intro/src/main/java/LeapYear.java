import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę rok.");
        int Year = scanner.nextInt();

        System.out.println(Year);

        if (Year%4==0 && Year%100==0 && Year%400==0) {
            System.out.println(Year + ("Jest to rok przestepny"));
        } else {
            System.out.println(Year + " " + ("Jest to rok nieprzestepny."));
        }
    }
}    