package HashTable;
import java.util.*;

public class LeetCode1636 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        System.out.println(map);
        int[] ans = new int[arr.length];
        int max = 0;
        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            max = Math.min(me.getValue(), max);
        }
        System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i] - max;
        }
        System.out.println(max);
    }
}
