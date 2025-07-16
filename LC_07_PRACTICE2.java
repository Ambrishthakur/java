
import java.util.Scanner;

public class LC_07_PRACTICE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Conversion factor: 1 kilometer = 0.621371 miles
        double miles = kilometers * 0.621371;

        // Display result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        sc.close();
    }
}

