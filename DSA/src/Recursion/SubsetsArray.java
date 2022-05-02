package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsArray {

    public static void main(String[] args) {
        int[] arr = {15, 20, 12};
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> results = subset(arr,0,ds);
//        System.out.println(subset(arr, 0, ds));
        System.out.println(results);
    }


    public static ArrayList<ArrayList<Integer>> subset(int[] arr, int i, ArrayList<Integer> ds)
    {
        if(i == arr.length)
        {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//            System.out.println(ds);
            res.add(ds);
            System.out.println(res);
            return res;
        }

        ds.add(arr[i]);
        ArrayList<ArrayList<Integer>> left = subset(arr, i+1, ds);
        ds.remove(ds.size()-1);
        ArrayList<ArrayList<Integer>> right = subset(arr, i+1, ds);
//        System.out.println("left" + left);
//        System.out.println("right" + right);

        left.addAll(right);
        return left;
    }
}


