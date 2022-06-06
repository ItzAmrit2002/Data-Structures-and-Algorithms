package Stacks;
import java.util.Stack;

/*
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.
 */

public class MinimumBracketReversal {
/*
The approach used for this problem: First we iterate through the expression and remove the already balanced part
by adding every opening bracket to the stack and if we come across a closing bracket we check if the previous bracket in the
stack is an opening bracket or not. If it is, we pop the opening bracket or else we push the closing bracket.

Now the stack contains only the unbalanced part. Now every time we pop two elements from the stack and check if they
are equal or not. If they are equal, we invert one bracket and add 1 to the count. If they are not equal, that means
they are in the order '}{' because the opposite would have been already eliminated in the previous process. So, we
add 2 to the count because we need to invert both the brackets to balance them.
 */

    public static int countBracketReversals(String input) {
        //Your code goes here
        if(input.length() % 2 != 0)
            return -1;

        Stack<Character> st = new Stack<>();

        for(int i=0; i<input.length(); i++)
        {

            if(input.charAt(i) == '{')
                st.push('{');

            if(input.charAt(i) == '}')
            {
                if(st.isEmpty())
                    st.push('}');
                else if(st.peek() == '{')
                    st.pop();
                else
                    st.push('}');
            }

        }
        int count = 0;
        while(!st.isEmpty())
        {
            char ch1 = st.pop();
            char ch2 = st.pop();

            if(ch1 == ch2)
            {
                count++;
            }
            else
            {
                count+=2;
            }

        }
        return count;
    }
}
