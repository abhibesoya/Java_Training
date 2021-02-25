package Exercise_5;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {8,2,8,0,9,0,6,0,5,0,8,0,7};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void moveZero(int[] arr)
    {
        int n = 0;
        for (int i: arr)
        {
            if (i != 0) {
                arr[n++] = i;
            }
        }

        for (int i = n; i < arr.length; i++) {
            arr[i] = 0;
        }

    }
}
