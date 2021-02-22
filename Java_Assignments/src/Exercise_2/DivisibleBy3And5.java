package Exercise_2;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int a = sc.nextInt();

        //Divisible by 3
        if (a % 3 == 0) {

            System.out.println("ConsultAdd");
        }

        //Divisible by 5
        else if(a % 5 == 0)
        {
            System.out.println("Java Training");
        }

        //Divisible by 3 and 5
        else if ( (a % 3 == 0) && (a % 5 ==0))
        {

            System.out.println("ConsultAdd Java Trining");

        }


    }
}
