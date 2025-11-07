package LeetCode;

//24-04-2023
//387. First Unique Character in a String.
public class LeetCode387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}
