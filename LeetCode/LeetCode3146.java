package LeetCode;

//04-11-2025
//3146. Permutation Difference between Two Strings.
public class LeetCode3146 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "edbac";
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    sum += Math.abs(i - j);
                }
            }
        }
        System.out.println(sum);
    }
}
