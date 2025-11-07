package LeetCode;
//21-08-2023
//1827.Minimum Operations to Make the Array Increasing.
public class LeetCode1827 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,1};
        int count = 0;

        for(int i=1; i< arr.length; i++){
            if(arr[i] <= arr[i-1]){
                int diff = (arr[i-1] - arr[i]) + 1;
                arr[i] += diff;
                count += diff;
            }
        }
        System.out.println(count);
    }
}
