package LeetCode;
import java.util.*;
//21-09-2023
//4.Median of Two Sorted Arrays.
public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        int[] ans = new int[nums1.length + nums2.length];
        int j = 0;
        for(int i=0; i<nums1.length; i++){
            ans[j] = nums1[i];
            j++;
        }
        for(int i=0; i<nums2.length; i++){
            ans[j] = nums2[i];
            j++;
        }
        Arrays.sort(ans);

        int mid = ans.length / 2;
        if(ans.length % 2 == 0){
            System.out.println((ans[mid - 1] + ans[mid]) / 2.0);
        }else{
            System.out.println(ans[mid]);
        }
    }
}
