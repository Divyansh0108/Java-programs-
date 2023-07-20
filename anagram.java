import java.util.*; //importing java utility package

public class anagram { // anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);

        System.out.println("Enter the first string: ");

        String s1 = xp.nextLine(); // taking input from user

        System.out.println("Enter the second string: ");

        String s2 = xp.nextLine(); // taking input from user
        
        String str1 = s1.replace(" ", ""); // removing spaces from the string
        String str2 = s2.replace(" ", "");

        s1 = str1.toLowerCase(); // converting the string to lowercase
        s2 = str2.toLowerCase();

        char[] ch1 = s1.toCharArray(); // converting the string to character array
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1); // sorting the character array
        Arrays.sort(ch2); 

        if (Arrays.equals(ch1, ch2)) { // comparing the character array
            System.out.println("It is an Anagram");
        } else {
            System.out.println(" It is Not Anagram");
        }

        xp.close(); // closing the scanner class
    }
}
