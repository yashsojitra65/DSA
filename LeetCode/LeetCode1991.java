package LeetCode;
//21-09-2023
//1991.Find the Middle Index in Array.
public class LeetCode1991 {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        leftSum[0] = nums[0];
        for(int i=1; i< nums.length; i++){
            leftSum[i] = leftSum[i - 1] + nums[i];
        }
        rightSum[nums.length-1] = nums[nums.length - 1];
        for(int i= nums.length - 2; i>=0; i--){
            rightSum[i] = rightSum[i + 1] + nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(leftSum[i] == rightSum[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
