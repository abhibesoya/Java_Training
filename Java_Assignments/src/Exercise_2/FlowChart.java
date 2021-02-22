package Exercise_2;

public class FlowChart {
    public static void main(String[] args) {

        int a=30;
        int b=30;
        int c=40;

        int average;

        average = (a+b+c)/3;

        System.out.println("Average="+average);

        if(average>a && average>b && average>c)
        {

            System.out.println("Average is higher than a,b,c");

        }
        else if(average>a && average>b)
        {

            System.out.println("Average is higher than a,b");

        }
        else if(average>a && average>c)
        {

            System.out.println("Average is higher than a,c");

        }
        else if(average>b && average>c)
        {

            System.out.println("Average is higher than b,c");

        }
        else if(average>a)
        {

            System.out.println("Average is just higher than a");

        }
        else if(average>b)
        {

            System.out.println("Average is just higher than b");

        }
        else if(average>c)
        {

            System.out.println("Average is just higher than c");

        }
    }
}
