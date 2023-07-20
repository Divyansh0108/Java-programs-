// time complexity : O(n)
// space complexity: O(1)
public class MissingNumberInArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 7, 6, 5};  // array of elements
        int n = arr.length;  // number of elements present in an array
        int m = n+1; // total number of elements in an array
        // sum of natural numbers in an array - O(1)
        int sum_natural_num = ((m)*(m+1))/2;  // sum of natural numbers
        int sum = 0;
        // sum of current elements present in an array - O(n)
        for(int i=0; i<n; i++){ // O(n)
            sum += arr[i]; // O(1)
        }

        int missing_elem = 0;
        missing_elem = sum_natural_num - sum; // O(1)
        System.out.println("Missing element in an array is: "+ missing_elem);
    } 
}
