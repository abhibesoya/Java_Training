package Exercise_8;

import java.util.Arrays;

public class StringWithA {
    public static void main(String[] args) {
        String []arr = {"Mike", "Tyson","Ema","lisa","Kate"};

        Arrays.stream(arr).filter(st->(st.endsWith("A"))||
                (st.endsWith("a"))).forEach(System.out::println);


    }
}
