package LeetCode;
import java.util.*;
//20-07-2023
//2239.Find Closest Number to Zero.
public class LeetCode2239 {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            if(nums[i] < 0){
                nums[i] = nums[i] * -1;
                list2.add(nums[i]);
            }else {
                list1.add(nums[i]);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.isEmpty()){
            System.out.print(-list2.get(0));
            return;
        }
        if(list2.isEmpty()){
            System.out.print(list1.get(0));
            return;
        }
        if(list1.get(0) <= list2.get(0)){
            System.out.println(list1.get(0));
            return;
        }
        System.out.println(-list2.get(0));



//        int min = Integer.MAX_VALUE;
//        int count = 0;
//
//        for(int i=0; i<nums.length; i++){
//            if(Math.abs(nums[i]) < min){
//                min = Math.abs(nums[i]);
//                count = nums[i];
//            } else if (Math.abs(nums[i]) == min) {
//                if(nums[i] > count){
//                    count = nums[i];
//                }
//            }
//        }
//        System.out.println(count);
    }
}
