package LeetCode;
//21-12-2023
//2455.Average Value of Even Numbers That Are Divisible by Three.
public class LeetCode2455 {
    public static void main(String[] args) {
        int[] nums = {1,3,6,10,12,15};
        int sum = 0;
        int count = 0;

        for(int i : nums){
            if(i % 2 == 0 && i % 3 == 0){
                sum += i;
                count++;
            }
        }
        if(sum == 0){
            System.out.println(0);
            return;
        }
        System.out.println(sum/count);
    }
}
