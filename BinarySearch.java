// Time Complexity: O(log N)
// Space Complexity: O(1)

import java.io.*;
import java.util.*;

public class BinarySearch {
    // Function definition
    public static int binarySearch(int[] arr, int target){
        int low=0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in an array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value that you want to search for: ");
        int target = sc.nextInt();

        // Function calling
        int result = binarySearch(arr, target);

        if(result != -1){
            System.out.println("Element is found at the location: "+result);
        }
        else{
            System.out.println("Element is not found");
        }
        
    }
}
// BinarySearch.java
// Displaying BinarySearch.java.

// Java implementation of iterative Binary Search

// import java.io.*;

// class BinarySearch {

// 	// Returns index of x if it is present in arr[].
// 	int binarySearch(int arr[], int x)
// 	{
// 		int l = 0, r = arr.length - 1;
// 		while (l <= r) {
// 			int m = l + (r - l) / 2;

// 			// Check if x is present at mid
// 			if (arr[m] == x)
// 				return m;

// 			// If x greater, ignore left half
// 			if (arr[m] < x)
// 				l = m + 1;

// 			// If x is smaller, ignore right half
// 			else
// 				r = m - 1;
// 		}

// 		// If we reach here, then element was
// 		// not present
// 		return -1;
// 	}

// 	// Driver code
// 	public static void main(String args[])
// 	{
// 		BinarySearch ob = new BinarySearch();
// 		int arr[] = { 2, 3, 4, 10, 40 };
// 		int n = arr.length;
// 		int x = 10;
// 		int result = ob.binarySearch(arr, x);
// 		if (result == -1)
// 			System.out.println(
// 				"Element is not present in array");
// 		else
// 			System.out.println("Element is present at "
// 							+ "index " + result);
// 	}
// }
