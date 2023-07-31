//time complexity is O(log n base 2)
//space complexity is O(n)

import java.util.*;
public class FindingPower {
    public static long powerFind(int num, long pow) 
    {
        long mid=0, result=0, finalResult=0;
        if (pow == 0) {
            return 1;
        } else if(pow==1)
        return num;
        else
        {
            mid = pow/2;
            result = powerFind(num, mid);
            finalResult = result * result;
            if(pow%2!=0)
            {
                finalResult = finalResult * num;
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the power");
        int pow = sc.nextInt();
        long result = powerFind(num, pow);
        System.out.println("The result is " + result);
        sc.close();
    }
}
