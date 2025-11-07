package HashTable;

import java.util.*;
//18-05-2023
//2554. Maximum Number of Integers to Choose From a Range I
public class LeetCode2554 {
    public static void main(String[] args) {
        int[] banned = {1,6,5};
        int n = 5;
        int maxSum = 6;
        HashSet<Integer> set = new HashSet<>();

        for(int i : banned){
            set.add(i);
        }
        System.out.println(set);
        int ans = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                sum = sum + i;
                if(sum > maxSum){
                    System.out.print(ans);
                    return;
                }
                ans++;
            }
        }
        System.out.print(ans);
    }
}
