package HashTable;
import java.util.*;
//01-05-2023
//3.Most frequent element in an array.-
public class frequent_element {
    public static void main(String[] args) {
        int[] arr = {1,1,2,5,2,2,4,4,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }

        int maxKey = 0;
        int maxValue = 0;
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            if(me.getValue() > maxValue){
                maxKey = me.getKey();
                maxValue = me.getValue();
            }
        }
        System.out.println(maxKey);

//        int[] ans = new int[map.size()];
//        int i = 0;
//        for (int value : map.values()) {
//            ans[i] = value;
//            i++;
//        }
//        Arrays.sort(ans);
//        int max = ans[ans.length - 1];
//        System.out.println(max);

//        for (int j = 0; j < ans.length; j++) {
//            System.out.print(ans[j] + " ");
//        }
    }
}
