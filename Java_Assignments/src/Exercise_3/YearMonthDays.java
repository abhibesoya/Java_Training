package Exercise_3;

import java.util.Scanner;

public class YearMonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for month:");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        switch(month)
        {

            case 1:
                System.out.println(year + " January has 31 days");
                break;

            case 2:
                if(year%4 == 0) {
                    System.out.println(year + " February has 29 days");
                }else
                {
                    System.out.println(year + " Februray has 28 days");
                }
                break;
            case 3:
                System.out.println(year + " March has 31 days");
                break;
            case 4:
                System.out.println(year + " April has 30 days");
                break;
            case 5:
                System.out.println(year + " May has 31 days");
                break;
            case 6:
                System.out.println(year + " June has 30 days");
                break;
            case 7:
                System.out.println(year + " July has 31 days");
                break;
            case 8:
                System.out.println(year + " August has 31 days");
                break;
            case 9:
                System.out.println(year + " September has 30 days");
                break;
            case 10:
                System.out.println(year + " October has 31 days");
                break;
            case 11:
                System.out.println(year + " November has 30 days");
                break;
            case 12:
                System.out.println(year + " December has 31 days");
                break;

            default:
                System.out.println("Invalid Month");

        }

    }
}
