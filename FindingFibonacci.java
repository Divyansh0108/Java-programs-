import java.util.*;
public class FindingFibonacci
{
    public static int fibonacci(int n)
    {
        int result=0;
        if(n<=1) //base case condition
        {
            return n;
        }

        else
        {
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print");
        int n = xp.nextInt();
        int result = fibonacci(n);
        System.out.println("Final output is: "+ result);
        xp.close();
    }
}