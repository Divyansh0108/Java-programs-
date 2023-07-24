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
