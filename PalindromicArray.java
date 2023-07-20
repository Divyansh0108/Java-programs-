// time complexity: O(n)
// space complexity: O(1)
//optimized solution to check if an array is palindromic or not
class PalindromicArray { // time complexity: O(n)
    public static void main(String[] args) { // space complexity: O(1)
        int[] array = {1, 2, 3, 2, 1};
        int n = array.length; // number of elements present in an array
        int flag = 0;

        for(int i=0; i<n/2; i++){ // O(n)
            if(array[i] != array[n-i-1]){ // O(1)
                flag = 1;
                System.out.println("Not a palindromic array");
                break;
            }
        }

        if(flag == 0){
            System.out.println("Palindromic array");
        }
    }
}