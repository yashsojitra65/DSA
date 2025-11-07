package LeetCode;
//05-11-2025
//3708. Longest Fibonacci Subarray.
public class LeetCode3708 {
    public static void main(String[] args) {
        int[] arr = {5,2,7,9,16};
        int max = 2;
        int ans = 2;

        for(int i=2; i< arr.length; i++){
            if(arr[i] == arr[i - 1] + arr[i - 2]){
                ans++;
            }else {
                max = Math.max(max,ans);
                ans = 2;
            }
        }
        System.out.println(Math.max(ans,max));
    }
}
