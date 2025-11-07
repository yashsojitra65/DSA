package LeetCode;
//19-09-2023
//2574.Left and Right Sum Differences.
public class LeetCode2574 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] ans = new int[nums.length];
        int sum = 0;
        int leftSum = 0;

        for (int num : nums){
            sum += num;
        }
        for (int i=0; i<nums.length; i++){
            sum -= nums[i];
            ans[i] = Math.abs(sum - leftSum);
            leftSum += nums[i];
        }
        System.out.println(ans);
    }
}