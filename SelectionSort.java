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