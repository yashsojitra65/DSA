package LeetCode;
import java.util.*;
//10-09-2023
//2848.Points That Intersect With Cars.
public class LeetCode2848 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(3, 6);
        List<Integer> list2 = Arrays.asList(1, 5);
        List<Integer> list3 = Arrays.asList(4, 7);

        ans.add(list1);
        ans.add(list2);
        ans.add(list3);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (List<Integer> list : ans) {
            int a = list.get(0);
            int b = list.get(1);

            max = Math.max(max, b);
            min = Math.min(min, a);
        }
        int[] arr = new int[max - min + 1];

        for (List<Integer> list : ans) {
            int a = list.get(0);
            int b = list.get(1);

            for (int i=a-min; i<=b-min; i++) {
                arr[i] = 1;
            }
        }

        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
