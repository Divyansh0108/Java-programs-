import java.util.*;
public class palindrome
{
    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);
        System.out.println("Enter a string for palindrome check");
        String s1 = xp.nextLine();
        String s2 = "";
        for(int i = s1.length()-1; i >= 0; i--)
        {
            s2 = s2 + s1.charAt(i);
        }
        xp.close();
        if(s1.equals(s2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}