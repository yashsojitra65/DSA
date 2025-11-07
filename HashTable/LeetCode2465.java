package HashTable;

import java.util.*;
//15-05-2023
//2465. Number of Distinct Averages.
public class LeetCode2465 {
    public static void main(String[] args) {
        int[] arr = {4,1,4,0,3,5};
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;

        while (left < right){
            sum = arr[left] + arr[right];
            set.add(sum);
            left++;
            right--;
        }
        System.out.println(set.size());
    }
}
