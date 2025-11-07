package LeetCode;
//05-08-2023
//2293.Min Max Game.
public class LeetCode2293 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,8,2,2};
        int n = arr.length;

        while(n>1){
            helper(arr, n);
            n /= 2;
        }
        System.out.println(arr[0]);
    }
    public static void helper(int[] nums, int n){
        for(int i=0;i<n/2;i++){
            if(i%2==0){
                nums[i]=Math.min(nums[2 * i], nums[2 * i + 1]);
            }
            else{
                nums[i]=Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
    }
}
