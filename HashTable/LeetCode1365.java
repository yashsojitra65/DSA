package HashTable;

import java.util.*;
//03-05-2023
//1365. How Many Numbers Are Smaller Than the Current Number
public class LeetCode1365 {
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int n = arr.length;
        int ans[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
        int p=0;
        for(int i=0; i< arr.length; i++) {
            int number = arr[i],sum=0;
            for (Map.Entry<Integer,Integer> e : map.entrySet()) {
                if (number > e.getKey()){
                    sum = sum + e.getValue();
                }
            }
            ans[p++]=sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}

