package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CombinationSum {

    public static void main(String[] args) {
        int[] arr = {5, 12,3,17,18,1,15,17};
        int target = 15;

//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        csum(arr, 0, target, ans, new ArrayList<>());
//        System.out.println(ans);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        csum2(arr, 0, target, ans, new ArrayList<>());
        System.out.println(ans);
    }

    //Includes the number itself

    public static void csum(int[] arr, int i, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds)
    {
        if(i == arr.length)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(ds));

            }
            return;
        }

        if(arr[i] <= target)
        {
            ds.add(arr[i]);
            csum(arr, i, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }

        csum(arr, i+1, target, ans, ds);
    }



//Excludes the number itself
public static void csum2(int[] arr, int i, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds)
{
    if(i == arr.length)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(ds));

        }
        return;
    }

    if(arr[i] <= target)
    {
        ds.add(arr[i]);
        csum2(arr, i+1, target-arr[i], ans, ds);
        ds.remove(ds.size()-1);
    }

    csum2(arr, i+1, target, ans, ds);
}
}