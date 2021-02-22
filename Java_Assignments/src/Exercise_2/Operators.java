package Exercise_2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int first = (int) sc.nextDouble();

        System.out.println("Enter Second number : ");
        int second = (int) sc.nextDouble();
        System.out.println("Select 1 for Addition, "+" 2 for Subtraction, "+" 3 for Multiplication, "+" 4 for Division,  "+" 5 for Average:");


        int result = sc.nextInt();


        switch (result) {
            case 1 :
                int sum1 = first + second;
                System.out.println(" sum of two numbers : " + (first + second) );
                if(sum1 < 0) {
                    System.out.println("Oops Invalid choice!");
                }
                break;
            case 2:
                int sum2 = first - second;
                System.out.println(" Subtraction of two numbers : "+ (first - second));
                if(sum2 < 0) {
                    System.out.println("Oops Invalid choice!");
                }
                break;
            case 3:
                int sum3 = first * second;
                System.out.println(" Multiplication of two numbers : "+ (first * second));
                if(sum3 < 0) {
                    System.out.println("Oops Invalid choice!");
                }
                break;
            case 4:
                int sum4 = first / second;
                System.out.println(" Division of two numbers : "+ (first / second));
                if(sum4 < 0) {
                    System.out.println("Oops Invalid choice!");
                }
                break;
            case 5:
                System.out.println("Enter first number : ");
                int first1 = (int) sc.nextDouble();
                System.out.println("Enter second number : ");
                int second2 = (int) sc.nextDouble();
                int sum5 = (first + second)/2;
                System.out.println(" Average of two numbers : "+ ((first + second)/2));
                if(sum5 < 0) {
                    System.out.println("Oops Invalid Selection!");
                }
                break;
            default :
                System.out.println("Invalid Choice!");




        }

    }

}

