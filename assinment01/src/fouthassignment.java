//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)


import java.util.Scanner;

public class fouthassignment {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number num1 ");
        double num1 = obj.nextDouble();


        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = obj.next().charAt(0);

        System.out.println("enter the second number num2 ");
        double num2 = obj.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;


        } else if (operator == '-') {
            result = num1 - num2;

        } else if (operator == '*') {
            result = num1 * num2;


        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return; // Exit the program
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return; // Exit the program
        }
        System.out.println(result);


        }

    }
