package LeetCode;

public class LeetCode2553 {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int count = 0;

        for(int i : nums){
            while (i != 0){
                count++;
                i = i / 10;
            }
        }
        int arr[] = new int[count];
        int idx = count - 1;
        for(int i=nums.length-1; i>=0; i--){
            int j = nums[i];
            while (j != 0){
                int temp = j % 10;
                arr[idx--] = temp;
                j = j / 10;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
//        list.stream().mapToInt(Integer::intValue).toArray();
    }
}
