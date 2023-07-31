import java.util.*;

public class NumberOfWays{
    public static int StairWays(int n){
        int result = 0;
        if(n<=1){
            return n;
        }

        else
        {
            result = StairWays(n-1) + StairWays(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();

        //relationship between this problem and fibonacci series
        int result = StairWays(n+1);
        System.out.println("The number of ways to reach the top is: " + result);
        sc.close();
    }
}

// time and space complexity same as fibonacci series