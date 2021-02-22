package Exercise_1;

public class SwapTwoNumbers {
    //Swaping numbers with third variable
        public static void main(String[] args) {

            int a = 10;
            int b = 20;

            System.out.println("Before swapping : a " + a + ", b " + b);

            int temp = a;
            a = b;
            b = temp;

            System.out.println("After swapping : a " + a + ", b " + b);

            //Swaping numbers without third variable
            a = a + b;
            b = a - b;
            a = a - b;


            System.out.println("After swapping without 3rd variable");
            System.out.println("After swapping : a " + a + ", b " + b);
        }
}


