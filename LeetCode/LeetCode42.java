package LeetCode;
//19-10-2023
//42.Trapping Rain Water.
public class LeetCode42 {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = 0;
        left[0] = height[0];

        for(int i=1; i<height.length; i++){
            left[i] = Math.max(height[i],left[i-1]);
        }
        right[height.length-1] = height[height.length - 1];
        for(int i=height.length-2; i>=0; i--){
            right[i] = Math.max(height[i],right[i+1]);
        }
        for(int i=0; i<height.length; i++){
            int level = 0;
            level = Math.min(left[i],right[i]);
            max += (level - height[i]);
        }
        System.out.println(max);
    }
}
