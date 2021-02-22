package Exercise_2;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'r' || ch == 'a' || ch == 'n'|| ch == 'd'|| ch == 'o'|| ch == 'm'
                || ch == 'R'  || ch == 'A' || ch == 'N' || ch == 'D' || ch == 'O' || ch == 'M')
        {
            System.out.println("FOUND.");
        }
        else
            System.out.println("NOT FOUND.");

    }
}
