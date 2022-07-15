package Hashmaps;

import java.util.HashMap;

public class LongestSubset0Sum {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
                max = i+1;
            }
            else
            {
                if(map.get(sum)!=null)
                {
                    max = Math.max(max, i-map.get(sum));
                }
                else
                {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
