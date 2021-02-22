package Exercise_4;

public class RemoveOddandEven {
    public static void main(String[] args) {
        int [] n1 = {23,25,75,87,47,1,91,51,2};
        int [] n2 = {22,44,64,76,98,12,43,54,90};
        System.out.println(removeEven(n1));
        System.out.println(removeOdds(n2));
    }

    public static int removeEven(int[] num){
        int result = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i]%2 == 0) {
                result = num[i];
            }
        }
        return result;
    }

    public static int removeOdds(int[] num){
        int result = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i]%2 != 0) {
                result = num[i];
            }
        }
        return result;
    }
}
