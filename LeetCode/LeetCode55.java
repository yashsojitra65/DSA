package LeetCode;
//21-10-2023
//55.Jump Game.
public class LeetCode55 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(i > count){
                System.out.println(false);
                return;
            }
            count = Math.max(count,i + nums[i]);
        }
        System.out.println(true);
    }
}
