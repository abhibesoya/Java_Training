package Exercise_1;

import java.util.Scanner;

public class PrintUserValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");

         int age = sc.nextInt();
        System.out.println("your age is : " + age);
    }
}
