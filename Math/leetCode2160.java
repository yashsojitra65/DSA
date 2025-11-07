package Math;

import java.util.Arrays;

//23-02-2023
//2160. Minimum Sum of Four Digit Number After Splitting Digits
public class leetCode2160 {
    public static void main(String[] args) {
        int num = 2932;
        int ans[] = new int[4];

        for(int i=0;i<4;i++){
            ans[i]=num%10;
            num/=10;
        }
        Arrays.sort(ans);
        System.out.println(Math.min(ans[0]*10 + ans[3] + ans[1]*10 + ans[2],ans[1]*10 + ans[3] + ans[0]*10 + ans[2]));
    }
}
