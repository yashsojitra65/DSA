package LeetCode;
//22-08-2023
//1004.Max Consecutive Ones III.
public class LeetCode1004 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = Integer.MIN_VALUE;

        while (j < arr.length) {
            if (arr[j] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[i] == 0) {
                    count--;
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        System.out.println(ans);
    }
}
