public class duplicatesInString {
    public static void main(String[] args) { // time complexity: O(n^2)
        String s1 = "This is an example";  
        int count;  

        char s[] = s1.toCharArray();   //Converts given string into character array
        
        System.out.println("Duplicate characters are:- ");  
        for(int i = 0; i <s.length; i++) {   
            count = 1;  
            for(int j = i+1; j <s.length; j++) {  
                if(s[i] == s[j] && s[i] != ' ') {  
                    count++;   
                    s[j] = '0';  
                }  
            } 
            if(count > 1 && s[i] != '0')  
                System.out.println(s[i]);  
        }  
    }  
} 