package LeetCode;
//21-07-2023
//2656.Maximum Sum With Exactly K Elements.
public class LeetCode2656 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        int min = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++){
            min = Math.max(nums[i], min);
        }
        int i = 0;
        int sum = 0;
        while (i < k){
            sum += min;
            min++;
            i++;
        }
        System.out.println(sum);
    }
}
