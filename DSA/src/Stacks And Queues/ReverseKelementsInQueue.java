package Stacks;

import java.util.Queue;
import java.util.Stack;

public class ReverseKelementsInQueue {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        Stack<Integer> s = new Stack<>();

        for(int i=1; i<=k; i++)
        {
            s.push(input.peek());
            input.poll();
        }

        while(!s.isEmpty())
        {
            input.add(s.peek());
            s.pop();
        }

        int n = input.size();

        for(int i=1; i<=n-k; i++)
        {
            int x = input.peek();
            input.poll();
            input.add(x);
        }

        return input;
    }
}
