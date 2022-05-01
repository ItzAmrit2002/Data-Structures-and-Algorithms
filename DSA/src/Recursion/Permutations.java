package Recursion;

public class Permutations {

    public static void main(String[] args) {
        permutations("abc", "");
    }

    public static void permutations(String s, String res)
    {
        if(s.isEmpty())
        {
            System.out.println(res);
            return;
        }

        char ch = s.charAt(0);

        for(int i=0; i<=res.length(); i++)
        {
            String f = res.substring(0,i);
            String l = res.substring(i, res.length());

            permutations(s.substring(1), f + ch + l);
        }
    }
}
