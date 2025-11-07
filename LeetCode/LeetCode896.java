package LeetCode;
//06-08-2023
//896.Monotonic Array.
public class LeetCode896 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                count1++;
            }
        }
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
                count2++;
            }
        }

        System.out.println(count1 == arr.length - 1 || count2 == arr.length - 1);
    }
}
