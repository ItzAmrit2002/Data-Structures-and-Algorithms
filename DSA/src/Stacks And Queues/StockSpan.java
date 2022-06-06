package Stacks;
import java.util.Stack;
/*
For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].
 */

public class StockSpan {
    /*
    The approach used for this problem: We start iterating through the array and store each elements index
    in a stack. If the stack is empty, the ans for that element is its index+1. If the element present at the index
    at the top of the stack is smaller than the current element, we pop that index until the stack is empty or
    we find an index at which the element is larger. In that case, the ans for the element will the difference between
    the current element index and the top element of the stack. We repeat this process for every element in the array.

    NOTE: After all of the above processes, each element is pushed into the stack.
     */
    public static int[] stockSpan(int[] price) {
        //Your code goes here

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[price.length];

        for(int i=0; i<price.length; i++)
        {
            while(!st.isEmpty() && price[i] > price[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = i+1;

            }
            else
            {
                ans[i] = i - st.peek();
            }
            st.push(i);

        }
        return ans;
    }
}
