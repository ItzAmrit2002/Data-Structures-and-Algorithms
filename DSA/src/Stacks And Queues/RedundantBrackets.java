package Stacks;
import java.util.ArrayList;
import java.util.Stack;

public class RedundantBrackets {

    /*
    This problem is solved by the approach: We iterate through the expression and push all the '(' and
    the operators into a stack, and then for every closing bracket we check if the previous element is a closing
    bracket or not. If it is, then we return true and if there is any operators present before we pop out the operators
    and pop again which will contain an opening bracket.Then we keep iterating for the rest of the expression.


     */

    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Character> st = new Stack<>();
        boolean ans = false;
        for(int i=0; i<expression.length(); i++)
        {
            if(expression.charAt(i)=='+' || expression.charAt(i)=='-' || expression.charAt(i)=='/' || expression.charAt(i)=='*')
            {
                st.push(expression.charAt(i));
            }
            else if(expression.charAt(i) == '(')
            {
                st.push(expression.charAt(i));
            }
            else if(expression.charAt(i) == ')')
            {
                if(st.peek() == '(')
                    ans = true;

                while(st.peek() == '+' || st.peek() == '-' || st.peek() == '/' || st.peek() == '*')
                {
                    st.pop();
                }
                st.pop();
            }
        }
        return ans;
    }
}
