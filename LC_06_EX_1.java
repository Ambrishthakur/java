// write a program to calculate percentage of a given student in  subjects CBSE  Board exam
   //his marks muste be taken as a user input 

import java.util.Scanner;

public class LC_06_EX_1{

    public static void main (String args[]){

        Scanner sc = new  Scanner(System.in);

        // Declare variables to store marks

        int Maths, English, Social_Science, Sanskrit, Science;
        int TotalMarks;
        double Percentage;

         // Input marks for each subject

        System.out.println("Enter marks out of 100 for 5 subjects:");

        System.out.println("Enter marks for Maths");
        Maths = sc.nextInt();

        System.out.println("Enter marks for English");
        English = sc.nextInt();

        System.out.println("Enter marks for Social Science");
        Social_Science = sc.nextInt();

        System.out.println("Enter marks for Sanskrit");
        Sanskrit = sc.nextInt();

        System.out.println("Enter marks for Science");
        Science = sc.nextInt();


        // Calculate total and percentage

         TotalMarks = Maths + English +Social_Science + Sanskrit + Science ;
         Percentage = (TotalMarks / 500.0) * 100;

        // Display result

          System.out.println("TotalMarks:" + TotalMarks);
          System.out.println("Percentage: " + Percentage);

          sc.close();




    }
    
}
