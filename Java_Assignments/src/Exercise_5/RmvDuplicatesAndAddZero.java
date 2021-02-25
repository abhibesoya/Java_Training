package Exercise_5;

public class RmvDuplicatesAndAddZero {
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,4,5,5,5,8,8,8,8};
        int len = arr.length;

        for(int i=0; i<len; i++) {
            for (int j=i+1;j<len; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }

        for(int i=0; i<len; i++) {
            if(arr[i] != 0)
                continue;
            else {
                for(int j=i;j<len;j++) {
                    if(arr[j] != 0) {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<len;i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
