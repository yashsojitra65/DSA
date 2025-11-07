package LeetCode;

//07-06-2023
//209.Minimum Size Subarray Sum.
public class LeetCode209 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int sum = 0;
        int max = Integer.MAX_VALUE;
        int j = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            while (sum >= target){
                max = Math.min(max,i-j+1);
                sum -= arr[j];
                j++;
            }
        }
        if(max == Integer.MAX_VALUE){
            System.out.println(0);
            return;
        }
        System.out.println(max);
    }
}
