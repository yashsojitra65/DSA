package HashTable;
import java.util.*;
//02-05-2023
//6. Count frequency of each number in array
public class frequent {
    public static void main(String[] args) {
        int[] arr = {1,1,2,5,2,2,4,4,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry me : map.entrySet()){
            System.out.println(me);
        }
    }
}
