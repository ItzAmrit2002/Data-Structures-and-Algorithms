package Stacks;
import java.util.*;
public class BalancedParanthesis {

    public static boolean isBalanced(String expression) {
        //Your code goes here

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<expression.length(); i++)
        {
            if(expression.charAt(i) == '(' || expression.charAt(i)=='{' || expression.charAt(i)=='[')
            {
                stack.push(expression.charAt(i));
            }

            if(!stack.isEmpty() && (expression.charAt(i) == ')' && stack.peek() == '(' || expression.charAt(i) == '}' && stack.peek() == '{' || expression.charAt(i) == ']' && stack.peek() == '[' ))
            {

                stack.pop();

            }
            // else
            // {
            //     return false;
            // }
        }

        if(stack.size()==0)
            return true;
        return false;
    }
}
