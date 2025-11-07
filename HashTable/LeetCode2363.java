package HashTable;
import java.util.*;
//15-08-2023
//2363.Merge Similar Items.
public class LeetCode2363 {
    public static void main(String[] args) {
        int[][] items1 = {
                {1, 1},
                {4, 5},
                {3, 8}
        };
        int[][] items2 = {
                {3,1},
                {1,5},
        };
        TreeMap<Integer,Integer> map = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int[] arr : items1){
            map.put(arr[0],map.getOrDefault(arr[0],0) + arr[1]);
        }
        for(int[] arr : items2){
            map.put(arr[0],map.getOrDefault(arr[0],0) + arr[1]);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            ans.add(list);
        }
        System.out.println(ans);
    }
}
