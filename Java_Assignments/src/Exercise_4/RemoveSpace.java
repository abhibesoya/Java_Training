package Exercise_4;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "I want to remove spaces from this string";
//        s1 = s1.replaceAll("\\s", "");

        System.out.println(removeSpaces(str));
    }
    public static String removeSpaces(String str){
        str = str.replaceAll("\\s", "");
        return str;
    }
}
