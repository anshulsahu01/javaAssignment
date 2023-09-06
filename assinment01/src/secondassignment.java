
// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class secondassignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name:  ");

        String name = input.next();
        System.out.println("hello welcome " + name);

    }
}