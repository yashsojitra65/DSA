package LeetCode;

//28-04-2023
//26. Remove Duplicates from Sorted Array.
public class LeetCode26 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int k = 1;

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                arr[k] = arr[i+1];
                k++;
            }
        }

        for(int i=0; i< k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
