//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class highestnum05 {
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        System.out.println("enter two number");
//        float num1 = obj.nextFloat();
//        float num2 = obj.nextFloat();
//
//        float max;
//
//        if( num1>num2){
//            System.out.println("max is "+ num1);
//
//        }else{
//            System.out.println(" max is "+num2);
//
//        }

//    6. Take 3 numbers as input and print the largest number.

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter two number");
        float num1 = obj.nextFloat();
        float num2 = obj.nextFloat();
        float num3 = obj.nextByte();

        float max;

        if (num1 > num2) {
            System.out.println("max is " + num1);

        } else if (num2>num3) {
            System.out.println("max is "+num2);

        } else {
            System.out.println("max is "+num3);
        }

    }






}