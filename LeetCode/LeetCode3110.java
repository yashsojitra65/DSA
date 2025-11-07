package LeetCode;
//003-11-2025
//3110. Score of a String.
public class LeetCode3110 {
    public static void main(String[] args) {
        String s = "zaz";
        int sum = 0;

        for(int i=1; i<s.length(); i++){
            int ascii1 = s.charAt(i - 1);
            int ascii2 = s.charAt(i);
            int value = ascii1 - ascii2;
            sum += Math.abs(value);
        }
        System.out.println(sum);
    }
}
