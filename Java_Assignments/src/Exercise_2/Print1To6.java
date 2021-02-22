package Exercise_2;

public class Print1To6 {
    public static void main(String[] args) {
        for(int a = 0; a < 6; a++){
            if(a==3){
                continue;
            }
            System.out.println(a);
        }
    }
}
