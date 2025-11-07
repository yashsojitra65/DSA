package LeetCode;
//13-08-2023
//1758.Minimum Changes To Make Alternating Binary String.
public class LeetCode1758 {
    public static void main(String[] args) {
        String s = "0100";
        int count = 0;

        for(int i=0; i<s.length(); i++){
             if((s.charAt(i) - '0') != (i % 2)){
                count++;
            }
        }
        System.out.println(Math.min(count,s.length() - count));
    }
}
