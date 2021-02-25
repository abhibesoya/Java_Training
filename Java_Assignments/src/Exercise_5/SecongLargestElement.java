package Exercise_5;

import java.util.Arrays;

public class SecongLargestElement {
    public static void main(String[] args) {
        int n[] = {1,5,8,9,7,4,2,2};
        int len = n.length;
        Arrays.sort(n);
        System.out.println("Second largest number is : " + n[len-2]);
    }
}
