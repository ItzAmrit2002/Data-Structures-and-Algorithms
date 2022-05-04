package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {

        //ARRAY MUST BE SORTED!!!
        int[] arr = {1,1,1,2,2};
//        List<List<Integer>> an = new ArrayList<>();
//        findCombinations(0, arr, 3, an, new ArrayList<>());
        System.out.println(csum2(arr, 0, 4, new ArrayList<Integer>()));
    }

    public static ArrayList<ArrayList<Integer>> csum2(int[] arr, int ind,int target, ArrayList<Integer> ds)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(target == 0)
        {
            list.add(new ArrayList<>(ds));
            System.out.println(ds);
            return list;
        }

        for(int i=ind; i<arr.length; i++)
        {
            if(i>ind && arr[i] == arr[i-1])
                continue;
            if(arr[i] > target)
                break;

            ds.add(arr[i]);
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            res = csum2(arr, i+1, target-arr[i], ds);

            ds.remove(ds.size()-1);
            list.addAll(res);
        }
        return list;
    }

    private static void findCombinations(int ind, int[] arr, int target, List<List< Integer >> ans, List < Integer > ds) {

        if (target == 0) {
            System.out.println(ds);
            ans.add(new ArrayList < > (ds));
            return;
        }



        for(int i=ind; i<arr.length; i++)
        {
            if(i>ind && arr[i] == arr[i-1])
                continue;
            if(arr[i] > target)
                break;
            ds.add(arr[i]);
            findCombinations(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}
