package Recursion;

import java.util.ArrayList;
import java.util.List;

public class phoneKeypad {

    public static void main(String[] args) {
        String[] n={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String digits = "23";
        System.out.println(keypad(digits, "", n));
    }

    public static List<String> keypad(String s, String ans, String[] n)
    {
        List<String> list = new ArrayList<>();

        if(s.isEmpty())
        {
            list.add(ans);
            return list;
        }

        int a = s.charAt(0) - '0';

        for(int i=0; i<n[a].length(); i++)
        {
            list.addAll(keypad(s.substring(1), ans+n[a].charAt(i), n));
        }
        return list;
    }
}
