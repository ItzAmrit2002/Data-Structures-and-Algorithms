package Recursion;

import java.util.Arrays;

public class mergeSortInPlace {

    public static void main(String[] args) {
        int[] array = {5,3,4,2,9};

        mergeSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] input, int s, int e)
    {
        if(e-s == 1)
            return;

        int m = (e+s)/2;

        mergeSort(input, s, m);
        mergeSort(input, m, e);

        merge(input, s, m, e);
    }

    public static void merge(int[] arr, int s, int m, int e)
    {
        int[] mix = new int[e-s];


        int i = s;
        int j = m;
        int k=0;

        while(i<m && j<e)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length; l++)
        {
            arr[s+l] = mix[l];
        }
    }
}
