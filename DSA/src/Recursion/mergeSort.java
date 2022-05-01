package Recursion;

import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = {4,3,2,9,5};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] input)
    {
        if(input.length == 1)
            return input;

        int[] left = mergeSort(Arrays.copyOfRange(input, 0, input.length/2));
        int[] right = mergeSort(Arrays.copyOfRange(input, input.length/2, input.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right)
    {
        int[] mix = new int[left.length + right.length];

        int i=0;
        int j=0;
        int k = 0;

        while(i<left.length && j<right.length)
        {
            if(left[i] < right[j])
            {
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length)
        {
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length)
        {
            mix[k] = right[j];
            j++;
            k++;
        }


        return mix;
    }
}
