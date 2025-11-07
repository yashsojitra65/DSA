package LeetCode;
//18-10-2023
//11.Container With Most Water.
public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length-1;
        int max = 0;

        while(left < right){
            int ans = (right - left) *(Math.min(height[left],height[right]));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            max = Math.max(max,ans);
        }
        System.out.println(max);
    }
}
