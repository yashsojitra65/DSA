package LeetCode;

import java.util.Arrays;

public class LeetCode1685 {
    public static void main(String[] args) {
        int[] num = {2,3,5};
        int[] ans = new int[num.length];

        for(int i=0; i< num.length; i++){
            int sum = 0;
            for(int j=0; j< num.length; j++){
                sum += Math.abs(num[i] - num[j]);
            }
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
