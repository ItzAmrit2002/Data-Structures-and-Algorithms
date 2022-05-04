package Recursion;

import java.util.ArrayList;

public class returnCodes {

    public static void main(String[] args) {
        String s = "1123";
//        System.out.println(codes(s, "", 0));
        codes2(s, "");
    }

    public static ArrayList<String> codes(String s, String ans, int i)
    {

        if(s.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int firstDigit = s.charAt(0) - '0';
        int firstTwoDigits = 0;
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> left = codes(s.substring(1), ans + (char)(96 + firstDigit), i);
        if (s.length() >= 2) {
            firstTwoDigits = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
            if (firstTwoDigits > 10 && firstTwoDigits <= 26) {
                right = codes(s.substring(2), ans + (char)(96 + firstTwoDigits), i);
            }
        }

        left.addAll(right);
        return left;
    }
    public static void codes2(String s, String ans)
    {

        if(s.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        int firstDigit = s.charAt(0) - '0';
        int firstTwoDigits = 0;

        codes2(s.substring(1), ans + (char)(96 + firstDigit));
        if (s.length() >= 2) {
            firstTwoDigits = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
            if (firstTwoDigits > 10 && firstTwoDigits <= 26) {
                codes2(s.substring(2), ans + (char)(96 + firstTwoDigits));
            }
        }


    }
}
