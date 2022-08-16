package patterns;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = in.nextInt();
        fiboTriangle(n);

    }
    public static void fib(int f[], int N)
    {

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= N; i++)


            f[i] = f[i - 1] + f[i - 2];
    }
    public static void fiboTriangle(int n)
    {

        int N = n * (n + 1) / 2;
        int f[] = new int[N + 1];
        fib(f, N);


        int fiboNum = 0;


        for (int i = 1; i <= n; i++) {
            for(int k=1; k<=n-i; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
                System.out.print(f[fiboNum++] + " ");

            System.out.println();
        }
    }
}
