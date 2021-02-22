package Exercise_3;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n = scan.nextInt();

        scan.close();
        for(int i = 1; i <= n; i++){

            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: "+ sum);
    }
}
