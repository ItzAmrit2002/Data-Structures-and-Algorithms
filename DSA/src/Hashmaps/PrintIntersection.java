package Hashmaps;

import java.util.HashMap;

public class PrintIntersection {
    public static void printIntersection(int[] arr1,int[] arr2){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++) {
            if(map.containsKey(arr1[i])) {
                int value = map.get(arr1[i]);
                map.put(arr1[i], value+1);

            }else {
                map.put(arr1[i], 1); //for 1st occurence of item the value is 1
            }
        }
        //now that map is ready for arr1
        for(int i=0;i<arr2.length;i++) {
            if(map.containsKey(arr2[i])) {
                int frequnecy = map.get(arr2[i]);
                if(frequnecy>0) {
                    System.out.println(arr2[i]);
                    map.put(arr2[i], frequnecy-1);
                }
            }
        }
    }
}
