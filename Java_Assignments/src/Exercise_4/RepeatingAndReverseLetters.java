package Exercise_4;

import java.util.Arrays;

public class RepeatingAndReverseLetters {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Palindrome";
        System.out.println(uniqueLetters(s1));
        System.out.println(uniqueLetters(s2));

        String str = "Reverse this String Please";
        String [] strArray = str.split(" ");
        System.out.println(reverseString(strArray));
    }
    public static boolean uniqueLetters(String str){

        str = str.toLowerCase();
        char[]ch = str.toCharArray();

        Arrays.sort(ch);

        for (int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
                return false;
        }
        return true;
    }

    public static String reverseString(String[] strArray){
        String rvsArr = " ";

        for(String s: strArray) {
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            rvsArr = rvsArr + sb.toString() + " ";

        }
        return rvsArr;
    }
}
