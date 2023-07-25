import java.util.*;
public class InsertionSort {
    
    public void sort(int[] arr)
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            int j=i;
            
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        Scanner xp = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = xp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = xp.nextInt();
        }
        obj.sort(arr);
        System.out.println("The sorted array is");
        String s = Arrays.toString(arr);
        System.out.println(s);
        xp.close();
    }
}


// Java program for implementation of Insertion Sort
// public class InsertionSort {
// 	/*Function to sort array using insertion sort*/
// 	void sort(int arr[])
// 	{
// 		int n = arr.length;
// 		for (int i = 1; i < n; ++i) {
// 			int key = arr[i];
// 			int j = i - 1;

// 			/* Move elements of arr[0..i-1], that are
// 			greater than key, to one position ahead
// 			of their current position */
// 			while (j >= 0 && arr[j] > key) {
// 				arr[j + 1] = arr[j];
// 				j = j - 1;
// 			}
// 			arr[j + 1] = key;
// 		}
// 	}

// 	/* A utility function to print array of size n*/
// 	static void printArray(int arr[])
// 	{
// 		int n = arr.length;
// 		for (int i = 0; i < n; ++i)
// 			System.out.print(arr[i] + " ");

// 		System.out.println();
// 	}

// 	// Driver method
// 	public static void main(String args[])
// 	{
// 		int arr[] = { 12, 11, 13, 5, 6 };

// 		InsertionSort ob = new InsertionSort();
// 		ob.sort(arr);

// 		printArray(arr);
// 	}
// };


/* This code is contributed by Rajat Mishra. */
