package Exercise_3;

import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first decimal number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second decimal number: ");
        double n2 = sc.nextDouble();

        if (Math.abs(n1 - n2) <= 0.01)
        {
            System.out.println("Same Decimal Values.");
        }
        else
        {
            System.out.println("Different Decimal Values.");
        }

    }
}
