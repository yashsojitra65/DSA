package LeetCode;

import java.util.Arrays;

//27-02-2023
//2206. Divide Array Into Equal Pairs.
public class LeetCode2206 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2};
        Arrays.sort(arr);

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] == arr[i+1]) {
                i++;
            }else {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
