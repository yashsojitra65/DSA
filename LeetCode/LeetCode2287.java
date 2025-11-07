package LeetCode;
//21-09-2023
//2287.Rearrange Characters to Make Target String.
public class LeetCode2287 {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        final int CHAR_RANGE = 26;
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for (char c : s.toCharArray()) {
            arr1[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            arr2[c - 'a']++;
        }

        int count = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR_RANGE; i++) {
            if (arr2[i] > 0) {
                count = Math.min(count, arr1[i] / arr2[i]);
                if (count == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
