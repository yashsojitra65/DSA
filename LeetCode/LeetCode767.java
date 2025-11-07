package LeetCode;
//23-08-2023
//767.Reorganize String.
public class LeetCode767 {
    public static void main(String[] args) {
        String s = "aaab";
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int max = 0, letter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                letter = i;
            }
        }
        if (max > (s.length() + 1) / 2) {
            System.out.println("");
            return;
        }
        char[] ans = new char[s.length()];

        int idx = 0;
        while (arr[letter]-- > 0) {
            ans[idx] = (char) (letter + 'a');
            idx += 2;
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (idx >= ans.length) {
                    idx = 1;
                }
                ans[idx] = (char) (i + 'a');
                idx += 2;
            }
        }
        System.out.println(String.valueOf(ans));
    }
}
