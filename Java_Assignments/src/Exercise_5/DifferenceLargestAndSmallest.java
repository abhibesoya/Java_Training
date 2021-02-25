package Exercise_5;

import java.util.Arrays;

public class DifferenceLargestAndSmallest {
    public static void main(String[] args) {
        int arr[] = {2,4,5,9,1,3,6};
        Arrays.sort(arr);
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];

        }
        System.out.println((max - min) + " is the difference between in largest and smallest numbers");
    }
}
