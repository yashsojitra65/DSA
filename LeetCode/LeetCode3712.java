package LeetCode;

import java.util.HashMap;
import java.util.Map;
//27-10-2025
//3712. Sum of Elements With Frequency Divisible by K.
public class LeetCode3712 {
    public static void main(String[] args) {
        int arr[] = {4,4,4,1,2,3};
        int k = 3;
        int ans = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1 );
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            if(me.getValue() % k == 0){
                ans += me.getKey() * me.getValue();
            }
        }
        System.out.println(ans);
    }
}
