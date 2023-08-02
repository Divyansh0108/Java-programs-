import java.util.*;
public class SearchInMatrix {

    public static int search(int[][] arr, int target)
    {
        {
            // number of rows
            int m = arr.length;
            if(m == 0){
                return -1;
            }
    
            // number of columns
            int n = arr[0].length;
    
            // binary search algorithm
            int low = 0, high = m * n - 1;
            int midIdx, midElement;
            while(low <= high){
                midIdx = low + (high - low)/2;
                midElement = arr[midIdx / n][midIdx % n];
                if(target == midElement){
                    return midIdx;
                }
                else{
                    if(target < midElement){
                        // left side
                        high = midIdx - 1;
                    }
                    else{
                        low = midIdx + 1;
                    }
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the elements of the arr: ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();
        int result = search(arr, n);
        System.out.println("The element is present at: " + result);
        sc.close();
    }
}
