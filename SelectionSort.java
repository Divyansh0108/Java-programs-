import java.util.*;

public class SelectionSort {
    
    public void sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.sort(arr);
        System.out.println("Sorted array is");
        String str = Arrays.toString(arr);
        System.out.println(str);
        sc.close();
    }
}


// Java program for implementation of Selection Sort
// import java.io.*;
// public class SelectionSort
// {
// 	void sort(int arr[])
// 	{
// 		int n = arr.length;

// 		// One by one move boundary of unsorted subarray
// 		for (int i = 0; i < n-1; i++)
// 		{
// 			// Find the minimum element in unsorted array
// 			int min_idx = i;
// 			for (int j = i+1; j < n; j++)
// 				if (arr[j] < arr[min_idx])
// 					min_idx = j;

// 			// Swap the found minimum element with the first
// 			// element
// 			int temp = arr[min_idx];
// 			arr[min_idx] = arr[i];
// 			arr[i] = temp;
// 		}
// 	}

// 	// Prints the array
// 	void printArray(int arr[])
// 	{
// 		int n = arr.length;
// 		for (int i=0; i<n; ++i)
// 			System.out.print(arr[i]+" ");
// 		System.out.println();
// 	}

// 	// Driver code to test above
// 	public static void main(String args[])
// 	{
// 		SelectionSort ob = new SelectionSort();
// 		int arr[] = {64,25,12,22,11};
// 		ob.sort(arr);
// 		System.out.println("Sorted array");
// 		ob.printArray(arr);
// 	}
// }
/* This code is contributed by Rajat Mishra*/
