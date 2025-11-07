package HashTable;

import java.util.HashMap;
//04-11-2025
//3046. Split the Array.
public class LeetCode3046 {
    public static void main(String[] args) {
        int[] arr = {6,1,3,1,1,8,9,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i]) >= 2){
                    System.out.println(false);
                    return;
                }else {
                    map.put(arr[i],map.get(arr[i]) + 1) ;
                }
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(true);
    }
}
