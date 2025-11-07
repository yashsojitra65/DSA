package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q350 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,7,9,7,6,7}, new int[]{5,0,0,6,1,6,2,2,4})));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        int[] freq1 = new int[1001];
        int[] freq2 = new int[1001];

        for (int i : nums1) freq1[i]++;
        for (int i : nums2) freq2[i]++;

        List<Integer> nums = new ArrayList<>();
        for (int i : nums1) if (!nums.contains(i))nums.add(i);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (freq1[nums.get(i)] > 0 && freq2[nums.get(i)] > 0) {
                int tmp = Math.min(freq1[nums.get(i)], freq2[nums.get(i)]);
                while (tmp != 0) {
                    list.add(nums.get(i));
                    tmp--;
                }
            }
        }

        int[] ans = new int[list.size()];
        int idx = 0;
        for (int i : list) ans[idx++] = i;

        return ans;
    }
}
