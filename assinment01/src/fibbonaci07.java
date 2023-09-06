//To calculate Fibonacci Series up to n numbers
// fibbonaci

import java.util.Scanner;

public class fibbonaci07 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter a number till that you want the fibbonaci");

        int n = obj.nextInt();
        int a =0;
        int b=1;
        int count =2;
        while (count<=n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);


    }
}
