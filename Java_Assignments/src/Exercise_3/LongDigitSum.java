package Exercise_3;

import java.util.Scanner;

public class LongDigitSum {
    public static void main(String[] args) {

        long sum=0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long n = sc.nextLong();

        while(n!=0)
        {
            sum = sum + n % 10;
            n=n/10;
            i++;

        }
        System.out.println("There are "+ i + " number of digits in n");
        System.out.println("Sum of digits is:" + sum);


    }
}
