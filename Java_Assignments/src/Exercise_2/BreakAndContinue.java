package Exercise_2;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        do {
            if(a < 0){
                System.out.println("It's over");
                break;
            }
            else {
                System.out.println("Going good");
                continue;
            }
        }
        while (true);
            System.out.println("negative value found");

    }
}
