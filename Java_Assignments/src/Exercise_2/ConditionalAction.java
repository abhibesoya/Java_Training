package Exercise_2;

import java.util.Scanner;

public class ConditionalAction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println("NEW");
        } else {
            if (a >= 2 && a <= 5) {
                System.out.println("OLD");
            } else if (a >= 6 && a <= 30) {
                System.out.println("NEW");
            } else {
                System.out.println("OLD");
            }
        }
    }
}