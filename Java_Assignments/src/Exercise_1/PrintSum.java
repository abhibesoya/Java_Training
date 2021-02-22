package Exercise_1;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter 1st number between 1-10 : ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number between 1-10 : ");
        int b = sc.nextInt();

        int sum = a + b;            //sum of two number

        // adding 30 to sum
        int z = 30;
        sum = sum + z;

        System.out.println("Final sum = " + sum);
    }
}
