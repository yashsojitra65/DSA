package HashTable;

import java.util.HashSet;
//25-03-2023
//349. Intersection of Two Arrays.
public class LeetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] ans = new int[set2.size()];
        int count = 0;
        for(int i : set2){
            ans[count++] = i;
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
