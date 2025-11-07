package LeetCode;
import java.util.*;
//04-11-2025
//3684. Maximize Sum of At Most K Distinct Elements.
public class LeetCode3684 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i : arr){
            set.add(i);
        }

//      System.out.println(set);
        ArrayList<Integer> list = new ArrayList<>(set);
        int j = 0;
        int len = Math.min(k, set.size());

        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = list.get(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
