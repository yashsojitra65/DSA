package LeetCode;

//18-04-2023
//389. Find the Difference.
public class LeetCode389 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";
        char c = 0;

        for(char c1 : s1.toCharArray()){
            c ^= c1;
        }
        for(char c2 : s2.toCharArray()){
            c ^= c2;
        }
        System.out.println(c);
    }
}
