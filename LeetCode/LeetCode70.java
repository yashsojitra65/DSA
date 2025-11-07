package LeetCode;
//14-10-2023
//70.Climbing Stairs.
public class LeetCode70 {
    public static void main(String[] args) {
        int n = 3;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n - 1]);
    }
}
