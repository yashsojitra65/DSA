package LeetCode;
//13-01-2024
//1347.Minimum Number of Steps to Make Two Strings Anagram.
public class LeetCode1347 {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[t.charAt(i) - 'a']++;
            freq[s.charAt(i) - 'a']--;
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            ans += Math.max(0,freq[i]);
        }

        System.out.println(ans);
    }
}
