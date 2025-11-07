package Math;

//12-07-2023
//1486.XOR Operation in an Array.
public class LeetCode1486 {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int[] ans = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            ans[i] = start + 2 * i;
            count ^= ans[i];
        }
        System.out.println(count);
    }
}
