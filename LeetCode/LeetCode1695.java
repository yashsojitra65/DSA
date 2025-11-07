package LeetCode;

import java.util.HashMap;

public class LeetCode1695 {
    public static void main(String[] args) {
        int[] arr =  {4,2,4,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        int i = 0;

        while (right < arr.length){
            if(map.containsKey(arr[right])){
                left = Math.max(map.get(arr[right]) + 1,left);
            }
            map.put(arr[right],right);
            i = Math.max(i,right - left + 1);
            max += arr[i];
            right++;
        }
        System.out.println(max);
    }
}
