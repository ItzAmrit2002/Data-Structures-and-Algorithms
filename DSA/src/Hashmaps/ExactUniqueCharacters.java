package Hashmaps;
import java.util.*;

public class ExactUniqueCharacters {
    public static String uniqueChar(String str){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(str.length()==0) {
            return "";
        }
        String ans = "";
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int currentIndex=0;currentIndex<str.length();currentIndex++) {
            char currentChar = str.charAt(currentIndex);
            if(!map.containsKey(currentChar)) {
                map.put(currentChar, true);
                ans += currentChar;
            }
        }
        return ans;

    }
}
