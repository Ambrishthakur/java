import java.util.Scanner;

public class LC_07_PRACTICE1 {

     public static void main(String[] args) {

    // Question 3

    //Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

       System.out.println("What is your name");
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       System.out.println("Hello " + name + " have a good day!");



    //  Question 4

    // Write a Java program to detect whether a number entered by the user is an integer or not.

        // System.out.println("Enter your number");
        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.hasNextInt());

        sc.close();
    
}
}
