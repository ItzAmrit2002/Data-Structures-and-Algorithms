package Hashmaps;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);

        }

        int min = 0;
        int max = 0;
        int longest = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(!set.contains(arr[i]-1))
            {
                int curr = arr[i];
                int temp = arr[i];
                int currMax = 0;
                int count = 1;

                while(set.contains(curr+1))
                {
                    curr+=1;
                    currMax = curr+1;
                    count+=1;
                }
                if(count > longest)
                {
                    longest = count;
                    min = temp;
                    max = currMax-1;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;

    }
}
