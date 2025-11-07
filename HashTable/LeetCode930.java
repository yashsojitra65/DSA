package HashTable;
import java.util.*;
//16-09-2023
//930.Binary Subarrays With Sum.
public class LeetCode930 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int goal = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum - goal)){
                count += map.get(sum - goal);
            }
            map.put(sum, 1 + map.getOrDefault(sum,0));
        }
        System.out.println(count);
    }
}
