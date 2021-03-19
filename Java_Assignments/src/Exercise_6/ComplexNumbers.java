package Exercise_6;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex obj = new Complex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two complex numbers: ");
        int real = sc.nextInt();
        int imaginary = sc.nextInt();
        obj.addition(real,imaginary);
        obj.subtraction(real,imaginary);
        obj.multiplication(real,imaginary);
    }

}

class Complex{
    public static void addition(int complex1, int complex2){
        int z = complex1 + complex2;
        System.out.println("The addition of " + complex1 + " + " + complex2 + " = " + z);
    }

    public static void subtraction(int complex1, int complex2){
        int z = complex1 - complex2;
        System.out.println("The subtraction of " + complex1 + " - " + complex2 + " = " + z);
    }

    public static void multiplication(int complex1, int complex2){
        int z = complex1 * complex2;
        System.out.println("The multiplicaiton of " + complex1 + " * " + complex2 + " = " + z);

    }
}
