package Exercise_4;

import java.util.Scanner;

public class SwapCase {
    static char ch;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thre String : ");
        String s1 = sc.nextLine();
        System.out.println(swap(s1));


    }

    public static String swap(String str){
        String s1 = new String();
        char[] str1 = str.toCharArray();
        for(char a:str1){
            if(Character.isLowerCase(a)){
                s1 += Character.toUpperCase(a);
            }
            else
                {
                s1 += Character.toLowerCase(a);
            }
        }
        return s1;
    }


}
