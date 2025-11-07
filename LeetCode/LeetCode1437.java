package LeetCode;

//05-07-2023
//1437.Check If All 1's Are at Least Length K Places Away.
public class LeetCode1437{
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,1};
        int k = 2;
        int count = 0;
        int flag = 0;

//        for(int i=0; i<nums.length-1; i++) {
//            if (nums[i + 1] == 0) {
//                count++;
//            } else if (count < k) {
//                System.out.println(false);
//                return;
//            }else {
//                count = 0;
//            }
//        }
//
//        System.out.println(true);

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 1) {
                if (count < k && flag == 1) {
                    System.out.println(false);
                    return;
                }
                count = 0;
                flag = 1;
            } else {
                count++;
            }
        }
        System.out.println(true);
    }
}
