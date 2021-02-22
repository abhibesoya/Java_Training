package Exercise_4;

import java.util.Stack;

public class Parenthises {
    public static void main(String[] args) {
        String s1 = "{[()}";
        System.out.println(balancedParentesis(s1));

    }
    public static boolean balancedParentesis(String expr)
    {
        if (expr.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return false;
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty()?true:false;
    }
}
