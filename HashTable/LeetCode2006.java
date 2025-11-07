package HashTable;
import java.util.*;
//04-05-2023
//2006.Count Number of Pairs With Absolute Difference K
public class LeetCode2006 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4};
        int k = 2;
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
    }
}
