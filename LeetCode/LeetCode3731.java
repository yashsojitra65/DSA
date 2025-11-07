package LeetCode;
import java.util.*;
//05-11-2025
//3731. Find Missing Elements.
public class LeetCode3731 {
    public static void main(String[] args) {
        int[] arr = {2,7};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int j = 1;

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            max = Math.max(max,i);
            min = Math.min(min, i);
            set.add(i);
        }
        for(int i = min;i <= max && i >= min; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
