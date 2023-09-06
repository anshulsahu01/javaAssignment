//06. Input currency in rupees and output in USD.

import java.util.Scanner;

public class RSTOus06 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter amout in Rupee");
        float Rupee = obj.nextFloat();
        double usd;
        double exchange = 0.014;

        usd = Rupee * exchange;
        System.out.println("the amount in usd"+ usd);

    }
}
