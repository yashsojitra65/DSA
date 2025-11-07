package LeetCode;
import java.util.*;
//04-11-2025
//3668. Restore Finishing Order.
public class LeetCode3668 {
    public static void main(String[] args) {
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[friends.length];

        for(int i : friends){
            set.add(i);
        }
        System.out.println(set);
        int j = 0;

        for(int i=0; i< order.length; i++){
            if(set.contains(order[i])){
                ans[j++] = order[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
