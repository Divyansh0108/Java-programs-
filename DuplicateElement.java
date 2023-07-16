public class DuplicateElement{
    public static void main(String[] args){
        int[] arr = {2, 3, 3, 6, 6, 9};
        int n = arr.length;
        int count=0;
        System.out.println("Duplicate Elements found is:");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    count++;
                }
            }
        }
        if(count==0)
        System.out.println("None");
    }
}