package patterns;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number of rows");
        n = in.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--)
            {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}
