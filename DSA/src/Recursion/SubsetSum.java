package Recursion;

import java.util.ArrayList;

public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {5,2,1};
        System.out.println(subsum(arr, 0, 0));
    }

    public static ArrayList<Integer> subsum(int[] arr, int i, int sum)
    {
        if(i == arr.length)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(sum);
            return ans;
        }

        sum+=arr[i];
        ArrayList<Integer> left = subsum(arr, i+1, sum);
        sum-=arr[i];
        ArrayList<Integer> right = subsum(arr, i+1, sum);

        left.addAll(right);

        return left;


    }
}
