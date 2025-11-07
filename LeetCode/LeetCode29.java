package LeetCode;
//21-08-2023
//29.Divide Two Integers.
public class LeetCode29 {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        if(i == Integer.MIN_VALUE && j == -1){
            System.out.println(Integer.MAX_VALUE);
            return;
        }
        System.out.println(i/j);
    }
}
