import java.util.*;
public class BinarySearchRecur {
    public static int binarySearch(int[] arr, int low, int high, int key)
    {
        int result = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==key)
            return mid;
            else if(arr[mid]<key)
            return binarySearch(arr, mid+1, high, key);
            else if(arr[mid]>key)
            return binarySearch(arr, low, mid-1, key);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int index = binarySearch(arr, 0, n-1, key);
        if(index==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "+index);
        sc.close();
    }
}
