package LeetCode;

import java.time.LocalDate;
import java.time.LocalTime;

//02-10-2023
//2871.Split Array Into Maximum Number of Subarrays.
public class LeetCode2871 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,2};
        int count = -1;
        int ans = 0;

        for(int i : arr){
            count &= i;
            if(count == 0){
                ans++;
                count =- 1;
            }
        }
        if (ans == 0){
            System.out.println(1);
        }
        System.out.println(ans);
    }
}
