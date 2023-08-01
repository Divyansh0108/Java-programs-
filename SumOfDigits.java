import java.util.*;
public class SumOfDigits {
    public static int getSum(int num)
    {
        int sum=0;
        if(num==0)
        {
            return 0;
        }
        else
        {
            sum = num%10 + getSum(num/10);
            return sum;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = getSum(num);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
