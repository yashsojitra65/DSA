package LeetCode;
//18-08-2023
//152.Maximum Product Subarray.
public class LeetCode152 {
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        int n = arr.length;

        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0){
                pre = 1;
            }
            if (suff == 0){
                suff = 1;
            }
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        System.out.println(ans);
    }
}
