package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        subsets("abc", "");

        System.out.println(subsets2("abc", ""));
    }

    public static void subsets(String s, String res)
    {
        if(s.isEmpty())
        {
            System.out.println(res);
            return;
        }
        char ch = s.charAt(0);
        subsets(s.substring(1), res+ch);
        subsets(s.substring(1), res);
    }

    public static ArrayList<String> subsets2(String s, String res)
    {
        if(s.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

        char ch = s.charAt(0);

        ArrayList<String> left = subsets2(s.substring(1), res + ch);
        ArrayList<String> right = subsets2(s.substring(1), res);

        left.addAll(right);
        return left;
    }


}
