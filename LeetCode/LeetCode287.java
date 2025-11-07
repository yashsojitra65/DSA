package LeetCode;//17-04-2023
//287. Find the Duplicate Number.

import java.util.HashSet;
public class LeetCode287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i=0; i< arr.length; i++){
            if(set.contains(arr[i])) {
                ans = arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        System.out.print(ans);
    }
}
