package LeetCode;
//27-12-2023
//1578.Minimum Time to Make Rope Colorful.
public class LeetCode1578 {
    public static void main(String[] args) {
        String s = "aaabbbabbbb";
        int[] cost = {3,5,10,7,5,3,5,5,4,8,1};
        int ans = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ans = ans + Math.min(cost[i], cost[i + 1]);
                cost[i + 1] = Math.max(cost[i], cost[i + 1]);
            }
        }
        System.out.println(ans);
    }
}
