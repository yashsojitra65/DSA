package LeetCode;

import java.util.Arrays;

//27-04-2023
//14. Longest Common Prefix.
public class LeetCode14 {
    public static void main(String[] args) {
        String arr[] = {""};

        Arrays.sort(arr);
        String left = arr[0];
        String right = arr[arr.length - 1];
        int count = 0;

        while (count < arr.length){
            if(left.charAt(count) == right.charAt(count)){
                count++;
            }else {
                break;
            }
        }
        if(count == 0){
            System.out.print("");
        }else {
            System.out.print(left.substring(0,count));
        }
    }
}
