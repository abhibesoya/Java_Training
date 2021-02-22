package Exercise_3;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter  any  calendar year :");
        int year=sc.nextInt();
        if(year!=0)
        {
            if(year%400==0)
                System.out.println(year+" is a leap year");
            else  if(year%100!=0)
            {
                if(year%4==0)
                    System.out.println(year+" is a leap year");
                else
                    System.out.println(year+" is not a leap year");
            }
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println("Year does not exist ");
    }
}
