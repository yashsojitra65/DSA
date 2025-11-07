package LeetCode;

//19-07-2023
//2460.Apply Operations to an Array.
public class LeetCode2460 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int k = 0;
        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] + nums[i + 1];
                nums[i + 1] = 0;
            }
        }

        while (j < nums.length - 1) {
            if (nums[j] != 0) {
                j++;
            } else {
                k = j + 1;
                while (k < nums.length - 1 && nums[k] == 0) {
                    k++;
                }
                if (k < nums.length) {
                    nums[j] = nums[k];
                    nums[k] = 0;
                }
                j++;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
