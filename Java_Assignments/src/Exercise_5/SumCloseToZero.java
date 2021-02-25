package Exercise_5;

import java.util.Scanner;

public class SumCloseToZero {
    public static void main(String[] args) {

        int min1 = 0, min2 = 1, sum, minimum;
        int a[] = {1,-3,-2,3,6,-5,8,-7};
        minimum=Math.abs(a[0] + a[1]);
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                sum = Math.abs(a[i] + a[j]);
                if(sum < minimum)
                {
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }
        System.out.println("Element 1:"+a[min1]);
        System.out.println("Element 2:"+a[min2]);

    }
}
