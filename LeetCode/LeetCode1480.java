package LeetCode;

//03-02-2023
//1480. Running Sum of 1d Array
public class LeetCode1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];

        for(int i=1; i<n; i++){
            ans[i] = arr[i] + ans[i-1];
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
