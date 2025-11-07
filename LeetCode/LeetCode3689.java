package LeetCode;
//06-11-2025
//3689. Maximum Total Subarray Value I.
public class LeetCode3689 {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        int k = 2;
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        for(int i : arr){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        long sum = (max - min) * k;

        System.out.println(sum);
    }
}
