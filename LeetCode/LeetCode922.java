package LeetCode;
import java.util.*;
//17-08-2023
//922.Sort Array By Parity II.
public class LeetCode922 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        int[] ans = new int[arr.length];
        int odd = 1;
        int even = 0;

        for(int i : arr){
            if(i % 2 == 0){
                ans[even] = i;
                even += 2;
            }else {
                ans[odd] = i;
                odd += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
