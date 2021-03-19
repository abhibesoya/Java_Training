package Exercise_7;

public class MaxValArray {
    public static void main(String[] args) {
        int[] numbers = { 1,5,8,9,-7,-8,45,85,82 };
        int maxVal = Integer.MIN_VALUE;

        for (int i : numbers) {
            maxVal = Math.max(i, maxVal);
        }

        System.out.println(maxVal);

    }
}
