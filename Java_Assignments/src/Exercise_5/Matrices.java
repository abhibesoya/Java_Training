package Exercise_5;

public class Matrices {
    public static void main(String[] args) {
        int m1[][]={{1,2,3},{4,5,1},{2,1,5}};
        int m2[][]={{2,1,4},{1,2,3},{6,2,4}};
        int sum[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
