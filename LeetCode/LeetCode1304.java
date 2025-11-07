package LeetCode;

//23-02-2023
//1304. Find N Unique Integers Sum up to Zero.
public class LeetCode1304 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        for (int i = 1; i<n; i+=2) {
            arr[i - 1] = i;
            arr[i] = -i;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
