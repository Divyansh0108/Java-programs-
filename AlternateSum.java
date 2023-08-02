import java.util.*;

public class AlternateSum {
    public static int sum(int n) {
        if(n==0) {
            return 0;
        }
        if(n%2==0)
        {
            return sum(n-1) -n;
        }
        else
        {
            return sum(n-1) +n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("The sum is: " + result);
        sc.close();
    }
}