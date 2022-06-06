package Stacks;

import java.util.Queue;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> input) {
        //Your code goes here

        if(input.isEmpty())
            return;

        int a = input.poll();
        reverseQueue(input);
        input.add(a);
    }
}
