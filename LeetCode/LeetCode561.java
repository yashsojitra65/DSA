package LeetCode;//23-02-2023
//561. Array Partition..

import java.util.Arrays;
public class LeetCode561 {
    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2};
        int n = arr.length;
        int sum = 0;
        Arrays.sort(arr);

        for(int i=0; i<n; i+=2){
            sum += arr[i];
        }
//        for(int i=1; i<n; i+=2){
//            sum += Math.min(arr[i],arr[i-1]);
//        }
        System.out.println(sum);
    }
}
