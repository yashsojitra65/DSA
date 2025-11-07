package LeetCode;

import java.util.Arrays;

//27-02-2023
//2341. Maximum Number of Pairs in Array.
public class LeetCode2341 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3,2,2};
        int[] ans = new int[2];
        int count = 0;
        Arrays.sort(arr);

        for(int i=1; i< arr.length; i++){
            if(arr[i] == arr[i-1]) {
                count++;
                i++;
            }
        }
        ans[0] = count;
        ans[1] = arr.length - (count * 2);

        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
