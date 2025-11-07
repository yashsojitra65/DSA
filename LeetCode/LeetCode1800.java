package LeetCode;
//05-08-2023
//1800.Maximum Ascending Subarray Sum.
public class LeetCode1800 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,5,10,50};
        int max = arr[0];
        int sum = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] > arr[i - 1]){
                sum += arr[i];
            }else {
                sum = arr[i];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
