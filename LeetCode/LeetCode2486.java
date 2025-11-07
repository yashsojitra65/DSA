package LeetCode;
//22-09-2023
//2486.Append Characters to String to Make Subsequence.
public class LeetCode2486 {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";

        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }else{
                i++;
            }
        }
        System.out.println(t.length()-j);
    }
}
