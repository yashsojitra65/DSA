package HashTable;

import java.util.*;
//17-05-2023
//2404.Most Frequent Even Element.
public class LeetCode2404 {
    public static void main(String[] args) {
        int[] arr = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (i%2==0) {
                if(map.containsKey(i)){
                    map.put(i,map.get(i) + 1);
                }else {
                    map.put(i,1);
                }
            }
        }
        System.out.println(map);
        int max = -1;
        int maxNum = -1;
        for(int i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                maxNum = i;
            }
            if(map.get(i) == max && i < maxNum){
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
}
