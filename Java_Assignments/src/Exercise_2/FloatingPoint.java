package Exercise_2;

import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        Float a = sc.nextFloat();

        if(a == 0)
        {

            System.out.println("zero");
        }

        if (a > 0)
        {
            System.out.println("Positive");

        }
        else if(a < 0)
        {

            System.out.println("Negative");

        }

        if(Math.abs(a) < 1)
        {
            System.out.println("Small");

        }
        else if (Math.abs(a) > 1000000)
        {

            System.out.println("Large");

        }
        sc.close();
    }
}
