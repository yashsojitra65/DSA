package HashTable;

import java.util.*;
//28-05-2023
//2225. Find Players With Zero or One Losses.
public class LeetCode2225 {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int[] arr : matches){
            int i = arr[0];
            int j = arr[1];
            set1.add(i);
            set2.add(j);
            map.put(j,map.getOrDefault(j,0) + 1);
        }
        for(int i : set1){
            if(!set2.contains(i)){
                list1.add(i);
            }
        }
        for(int i : set2){
            if(map.get(i) == 1){
                list2.add(i);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        ans.add(list1);
        ans.add(list2);

        System.out.print(ans);
    }
}
