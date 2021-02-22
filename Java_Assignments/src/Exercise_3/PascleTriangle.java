package Exercise_3;

import java.util.Scanner;

public class PascleTriangle {
    public static void main(String[] args)
    {
        int rows = 5;
        int c = 1;
        for(int i=0;i<rows;i++)
        {
            for(int spc=1;spc<=rows-i;spc++)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
