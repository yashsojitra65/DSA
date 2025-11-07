package LeetCode;
import java.util.*;
//20-09-2023
//506.Relative Ranks.
public class LeetCode506 {
    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        int[] copyArrays = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            copyArrays[i] = score[i];
        }
        Arrays.sort(score);
        String[] ans = new String[score.length];
        int count = 1;
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = score.length - 1; i >= 0; i--) {
            if (count == 1) {
                map.put(score[i], "Gold Medal");
                count++;
            } else if (count == 2) {
                map.put(score[i], "Silver Medal");
                count++;
            } else if (count == 3) {
                map.put(score[i], "Bronze Medal");
                count++;
            } else {
                map.put(score[i], String.valueOf(count));
                count++;
            }
        }
        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(copyArrays[i]);
        }
        for (String i : ans) {
            System.out.println(i);
        }
    }
}
