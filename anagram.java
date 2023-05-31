import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);

        System.out.println("Enter the first string: ");

        String s1 = xp.nextLine();

        System.out.println("Enter the second string: ");

        String s2 = xp.nextLine();
        
        String str1 = s1.replace(" ", "");
        String str2 = s2.replace(" ", "");

        s1 = str1.toLowerCase();
        s2 = str2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println(" It is Not Anagram");
        }

        xp.close();
    }
}
