package Recursion;

import java.util.*;
public class towerOfHanoi {

    public static void tower(int n, char s, char aux, char d)
    {
        if(n==1)
        {
            System.out.println("move disk 1 from " + s + " to " + d);
            return;
        }


        tower(n-1, s, d, aux);
        System.out.println("move disk " + n + " from " + s + " to " + d);
        tower(n-1, aux, s, d);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of disks");
        int n = in.nextInt();
        tower(n, 'a', 'b', 'c');
    }
}
