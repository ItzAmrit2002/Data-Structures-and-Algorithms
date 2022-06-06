package Stacks;
import java.util.*;

public class NearestSmallestElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] nums = {4,10,5,8,20,15,3,12};


        for (int i = 0; i < nums.length; i++) {
            while(!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.print("-1 ");
            }
            else {
                System.out.print(stack.peek()+ " ");
            }
            stack.push(nums[i]);

        }




    }


}
