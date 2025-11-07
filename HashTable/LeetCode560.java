package HashTable;
import java.util.*;
//17-08-2023
//560.Subarray Sum Equals K.
public class LeetCode560 {
    public static void main(String[] args){
        int[] arr = {1,-1,0};
        int k = 3;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int remove = sum - k;
            ans += map.getOrDefault(remove, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.print(ans);
    }
}
