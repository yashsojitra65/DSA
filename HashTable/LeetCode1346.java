package HashTable;

import java.util.*;
//31-05-2023
//1346. Check If N and Its Double Exist.
public class LeetCode1346 {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i] * 2)){
                System.out.println(true);
                return;
            } else if ((map.containsKey(arr[i] / 2)) && (arr[i] % 2 == 0)) {
                System.out.println(true);
                return;
            }else {
                map.put(arr[i],i);
            }
        }
        System.out.println(false);
    }
}
