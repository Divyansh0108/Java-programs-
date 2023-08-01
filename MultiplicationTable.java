import java.util.*;
public class MultiplicationTable {
    public static void printTable(int n, int r) {
        if(r==1){
            System.out.println(n);
            return;
        }
        
            
            printTable(n, r-1);
            System.out.println(n+" * "+r+" = "+n*r);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the range: ");
        int r = sc.nextInt();
        printTable(n, r);
        sc.close();

    }
}
