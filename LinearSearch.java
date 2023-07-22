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