package LeetCode;
//16-08-2023
//2586.Count the Number of Vowel Strings in Range.
public class LeetCode2586 {
    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right = 4;
        boolean[] vowel = new boolean[26];
        vowel['a' - 'a'] = true;
        vowel['e' - 'a'] = true;
        vowel['i' - 'a'] = true;
        vowel['o' - 'a'] = true;
        vowel['u' - 'a'] = true;

        int count = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length() - 1);

            if (vowel[firstChar - 'a'] && vowel[lastChar - 'a']) {
                count++;
            }
        }
        System.out.println(count);
    }
}
