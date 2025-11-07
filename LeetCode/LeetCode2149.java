package LeetCode;
import java.util.*;
//17-08-2023
//2149.Rearrange Array Elements by Sign.
public class LeetCode2149 {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;

        for (int i : arr){
            if(i < 0){
                ans[neg] = i;
                neg += 2;
            }else {
                ans[pos] = i;
                pos += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
