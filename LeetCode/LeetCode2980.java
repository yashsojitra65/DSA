package LeetCode;
//01-01-2024
//2980.Check if Bitwise OR Has Trailing Zeros.
public class LeetCode2980 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        int count = 0;

        for(int i : nums){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count>1);
    }
}
