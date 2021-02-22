package Exercise_4;

public class ShortestString {
    public static void main(String[] args) {
        String s1 = "Welcome to String program";
        String strArr[] = s1.split(" ");
        String shortestWord = strArr[0];

        for(String s2:strArr)
        {
            if(s2.length() < shortestWord.length())
                shortestWord = s2;
        }
        System.out.println("Shortest word in this string is: " + shortestWord);
    }
}
