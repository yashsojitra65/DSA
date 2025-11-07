package LeetCode;
//21-09-2023
//724.Find Pivot Index.
public class LeetCode724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
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
