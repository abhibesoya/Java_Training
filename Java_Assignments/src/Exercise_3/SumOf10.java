package Exercise_3;

import java.util.Scanner;

public class SumOf10 {
    public static void main(String[] args) {
        int sum=0;
        int average;


        for(int i = 0; i < 10; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            sum += sc.nextInt();

        }
        System.out.println("Sum of numbers is :"+sum);

        average=(sum/10);

        System.out.println("Average of numbers is : "+ average);

    }
}
