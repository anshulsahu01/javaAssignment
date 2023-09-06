

// Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

import java.util.Scanner;

public class Thirdassignment {

//
//        public static void main(String[] args) {
//            // Create a Scanner object to read user input
//            Scanner scanner = new Scanner(System.in);
//
//            // Prompt the user to enter the principal amount
//            System.out.print("Enter the principal amount (P): ");
//            double principal = scanner.nextDouble();
//
//            // Prompt the user to enter the time in years
//            System.out.print("Enter the time in years (T): ");
//            double time = scanner.nextDouble();
//
//            // Prompt the user to enter the rate of interest
//            System.out.print("Enter the rate of interest (R): ");
//            double rate = scanner.nextDouble();
//
//            // Calculate the simple interest using the formula: SI = (P * T * R) / 100
//            double simpleInterest = (principal * time * rate) / 100;
//
//            // Display the result
//            System.out.println("Simple Interest: " + simpleInterest);
//
//            // Close the Scanner
//            scanner.close();
//        }

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the value of p");
        double p = obj.nextDouble();
        System.out.println("enter the value of r");
        double r = obj.nextDouble();
        System.out.println("enter the value of y");
        double y = obj.nextDouble();

        double si = (p * y * r) / 100;
        System.out.println("value of si is"+ si);
//        System.out.println( si);

    }








    }


