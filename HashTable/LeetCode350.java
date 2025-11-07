package HashTable;

import java.util.HashMap;
//13-05-2023
//350. Intersection of Two Arrays II.
public class LeetCode350 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i : nums1){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i) + 1);
            }else {
                map1.put(i,1);
            }
        }
        System.out.println(map1);
        for(int i : nums2){
            if(map2.containsKey(i)){
                map2.put(i,map2.get(i) + 1);
            }else {
                map2.put(i,1);
            }
        }
        System.out.println(map2);
        int count = 0;
        for(int i : map1.keySet()){
            if(map2.containsKey(i)){
                int k = map2.get(i);
                map1.put(i,Math.min(k,map1.get(i)));
                count += Math.min(k,map1.get(i));
            }else {
                map1.put(i,0);
            }
        }
        int ans[] = new int[count];
        int k=0;
        for(int i : map1.keySet()){
            int n = map1.get(i);
            while (n > 0){
                ans[k++] = i;
                n--;
            }
        }
        for(int i : ans){
            System.out.print( i + " ");
        }
    }
}
