package Exercise_5;

import java.util.Arrays;
import java.util.Scanner;

public class TargetValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value");
        int targetValue = sc.nextInt();
        int arr[] = {1,3,4,7,2,5,6,9,8};

        Arrays.sort(arr);
        int a = 0;
        int b = arr.length - 1;

        while(a < b) {
            if(arr[a] + arr[b] == targetValue) {
                System.out.println("Sum of : " + arr[a] +" & "+ arr[b] + " Which are equal to entered target value " + targetValue);
                a++;
                b--;
                continue;
            }
            else if(arr[a] + arr[b] < targetValue) {
                a++;
            }
            else if(arr[a]+ arr [b] > targetValue) {
                b--;
            }
            else
                break;

        }
    }
}
