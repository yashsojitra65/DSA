package LeetCode;

//03-07-2023
//80.Remove Duplicates from Sorted Array II.
public class LeetCode80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};

        if(nums.length <= 2){
            System.out.print(nums.length);
            return;
        }
        int k = 2;
        int freq = 1;
        int eleCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                freq++;
            }else{
                freq = 1;
            }
            if(freq <= k){
                nums[eleCount] = nums[i];
                eleCount++;
            }
        }
        System.out.print(eleCount);
    }
}
