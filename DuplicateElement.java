public class DuplicateElement{ 
    public static void main(String[] args){ //main method
        int[] arr = {2, 3, 3, 6, 6, 9};
        int n = arr.length; //number of elements present in an array
        int count=0;
        System.out.println("Duplicate Elements found is:");
        for(int i=0; i<n; i++){ //loop to iterate over an array
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){ //check if the elements are equal
                    System.out.println(arr[i]);
                    count++;
                }
            }
        }
        if(count==0) //if count is 0, then no duplicate elements are found
        System.out.println("None");
    }
}