package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetArrayWithoutDuplicates {

    public static void main(String[] args) {

        //ARRAY MUST BE SORTED!!
        int arr[] = {1,2,2};
        List<List<Integer>> an = new ArrayList<>();
        findCombinations(0, arr, an, new ArrayList<>());
        System.out.println(an);

    }
    private static void findCombinations(int ind, int[] arr, List<List< Integer >> ans, List < Integer > ds) {





        for(int i=ind; i<arr.length; i++)
        {
            if(i>ind && arr[i] == arr[i-1])
                continue;

            ds.add(arr[i]);
            findCombinations(i+1, arr, ans, ds);
            ds.remove(ds.size()-1);
        }
        ans.add(new ArrayList < > (ds));
    }
}
