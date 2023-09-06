

//1. Write a program to print whether a number is even or odd, also take
//        input from the user.

import java.util.Scanner;

public class firstasisment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");

        int  num = input.nextInt();
//        System.out.println("the number is " + num);

        if ( num % 2 == 0){
            System.out.println("the num is even");
        }
        else{
            System.out.println("the number is odd");
        }


    }
}
