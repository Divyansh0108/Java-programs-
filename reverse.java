import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String s1 = xp.nextLine();
        String s = "";
        xp.close();
        for (int i = s1.length() - 1; i >= 0; i--) {
            s = s + s1.charAt(i);
        }
        System.out.println("Reverse of the string is:- " + s);
    }
}
