package Recursion;

import java.util.Scanner;

public class skipWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String");
        String s = in.nextLine();
        System.out.println("Enter the word u want to remove");
        String word = in.nextLine();

        System.out.println(skipWord(s, word));
    }

    public static String skipWord(String s, String word)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.startsWith(word))
        {
            return skipWord(s.substring(word.length()), word);
        }
        else {
            return s.charAt(0) + skipWord(s.substring(1), word);
        }
    }

}
