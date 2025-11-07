package HashTable;

import java.util.HashSet;
//13-05-2023
//2442. Count Number of Distinct Integers After Reverse Operations.
public class LeetCode2442 {
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        int[] ans = new int[nums.length * 2];
        int count = 0;

        for(int i=0; i<nums.length; i++){
            ans[count++] = nums[i];
            int first = nums[i];
            int rev = 0;
            while (first != 0){
                int last = first % 10;
                rev = (rev * 10) + last;
                first = first / 10;
            }
            ans[count++] = rev;
        }
        for(int i=0; i< ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        for(int i : ans){
            set.add(i);
        }
        System.out.println(set.size());
    }
}
