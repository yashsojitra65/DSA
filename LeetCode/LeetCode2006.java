package LeetCode;

import java.util.*;

//18-02-2023
//2006. Count Number of Pairs With Absolute Difference K
public class LeetCode2006 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int n = arr.length;
        int k = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);

        int count=0;
        for(int i=0; i<arr.length; i++){
            int sum = arr[i] + k;
            if(map.containsKey(sum)){
                count = count + map.get(sum);
            }
        }
        System.out.println(count);


//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(arr[i] - arr[j] == k){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
