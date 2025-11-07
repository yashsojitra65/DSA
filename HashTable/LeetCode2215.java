package HashTable;

import java.util.*;

//07-05-2023
//2215. Find the Difference of Two Arrays.
public class LeetCode2215 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {2,4,6};
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        for(int i : arr1){
            set1.add(i);
        }
        for(int i : arr2){
            set2.add(i);
        }
        for (int n : set1){
            if(!set2.contains(n)){
                ans1.add(n);
            }
        }
        for (int n : set2){
            if(!set1.contains(n)){
                ans2.add(n);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        System.out.println(ans);
    }
}
