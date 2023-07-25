import java.util.*;

public class LinearSearch {

    public int search(int arr[], int element) {
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner xp = new Scanner(System.in);
        LinearSearch obj = new LinearSearch();
        System.out.println("Please enter the size of array ");
        int size = xp.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements of array ");
        for(int i=0;i<size;i++){
            arr[i] = xp.nextInt();
        }
        System.out.println("Please enter the element to be searched ");
        int element = xp.nextInt();

        if(obj.search(arr, element) == -1){
            System.out.println("The element is not present in the array");
            System.exit(0);
        }

        int result = obj.search(arr, element);
        System.out.println("The element is present at index "+result);
        
        xp.close();
    }
}


// Java code for linearly searching x in arr[].

// import java.io.*;

// class GFG {
// 	public static int search(int arr[], int N, int x)
// 	{
// 		for (int i = 0; i < N; i++) {
// 			if (arr[i] == x)
// 				return i;
// 		}
// 		return -1;
// 	}

// 	// Driver code
// 	public static void main(String args[])
// 	{
// 		int arr[] = { 2, 3, 4, 10, 40 };
// 		int x = 10;

// 		// Function call
// 		int result = search(arr, arr.length, x);
// 		if (result == -1)
// 			System.out.print(
// 				"Element is not present in array");
// 		else
// 			System.out.print("Element is present at index "
// 							+ result);
// 	}
// }
