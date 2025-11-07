package LeetCode;

//21-04-2023
//242. Valid Anagram.
public class LeetCode242 {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++){
            arr[s2.charAt(i) - 'a']--;
        }
        for (int i : arr){
            if (i != 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
