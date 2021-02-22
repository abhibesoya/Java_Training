package Exercise_4;

public class SkipHighLowSum {
    public static void main(String[] args) {
        int highestIndex = 0;
        int smallestIndex = 0;
        int sum = 0;
        int [] num = {1,5,7,8,9};

        for(int i = 0; i < num.length; i++)
        {
            for(int j = i+1; j < num.length; j++)
            {
                if(num[i] > num[j])
                    highestIndex = j;
            }
        }
        for(int i = 0; i < num.length; i++)
        {
            for(int j = i+1; j < num.length; j++)
            {
                if(num[i] < num[j])
                    smallestIndex = j;
            }
        }
        for(int i = 0; i <num.length; i++)
        {
            if(i == smallestIndex || i == highestIndex)
                continue;
            sum += num[i];
        }
        System.out.println(sum);
    }
}
