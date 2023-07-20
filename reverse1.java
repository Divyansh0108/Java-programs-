import java.util.*;
public class reverse1 { // time complexity: O(n)
    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);
        System.out.println("Enter the sentence:- ");
        String s = xp.nextLine();
        String s1 = "";
        String s2[] = s.split(" ");
        for(int i=s2.length-1;i>=0;i--)
        {
            s1 = s1 + " " + s2[i];
        }
        System.out.println("the reversed string is:- " +s1);
        xp.close();
    }
}
