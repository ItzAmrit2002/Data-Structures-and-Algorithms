package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,7,1};
        qsort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void qsort(int[] nums, int lo, int hi)
    {
        if(lo>=hi)
            return;

        int s = lo;
        int e = hi;
        int m = (e+s)/2;

        int pivot = nums[m];

        while(s<=e)
        {
            while(nums[s] < pivot)
                s++;

            while(nums[e] > pivot)
                e--;

            if(s<=e)
            {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }

            qsort(nums, lo, e);
            qsort(nums, s, hi);
        }
    }
}
