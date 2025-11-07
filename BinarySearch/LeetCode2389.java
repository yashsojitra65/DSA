package BinarySearch;
import java.util.*;
//06-09-2023
//2389.Longest Subsequence With Limited Sum.
public class LeetCode2389 {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1};
        int[] queries = {3,10,21};

        Arrays.sort(arr);
        int ans[] = new int[queries.length];

        for (int i=0; i<queries.length; i++) {
            int count = 0;
            int n = queries[i];
            for (int num : arr){
                if (n >= num){
                    count++;
                    n -= num;
                } else {
                    break;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
