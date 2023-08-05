import java.util.*;
public class TilingProblem
{
    public static int getWays(int n)
    {
        if(n<=3)
        return n;
        return getWays(n-1)+getWays(n-4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the floor");
        int n = sc.nextInt();
        System.out.println("The number of ways to tile the floor is "+getWays(n));
        sc.close();
    }
}