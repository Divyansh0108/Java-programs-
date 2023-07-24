import java.util.*;

public class BubbleSort
{
    public void Sort(int[] arr) //creating a function with the name of Sort which exactly does what is says
    {
        int n = arr.length; // getting length of the array
        
        for(int i=0;i<n;i++)
        {
            boolean swapped = false; // creating a boolean variable to check if the array is sorted or not
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) //checking for the condition for ascending order
                {
                    int temp = arr[j]; //swapping the elements based on the condition
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped = true;
                }
            }

            if(!swapped) //checking if the program hit a break
            break;
        }
    }


    public static void main(String[] args) { //creating main method
        BubbleSort obj = new BubbleSort();
        Scanner xp = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = xp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=xp.nextInt();
        }
        obj.Sort(arr); //passing the current array into sort function to sort it
        System.out.println("The sorted array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        xp.close(); //closing the scanner class
    }
}