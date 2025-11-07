package LeetCode;

import java.util.Arrays;

//12-03-2023
//1356. Sort Integers by The Number of 1 Bits.
public class LeetCode1356 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};

        for(int i=0; i< arr.length;i++){
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%10001;
        }

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
