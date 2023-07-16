// time complexity : O(n)
// space complexity: O(1)
public class MissingNumberInArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 7, 6, 5};
        int n = arr.length;
        int m = n+1;
        // sum of natural numbers in an array - O(1)
        int sum_natural_num = ((m)*(m+1))/2;
        int sum = 0;
        // sum of current elements present in an array - O(n)
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int missing_elem = 0;
        missing_elem = sum_natural_num - sum;
        System.out.println("Missing element in an array is: "+ missing_elem);
    } 
}
