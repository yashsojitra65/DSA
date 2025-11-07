package LeetCode;
import java.util.*;

//04-11-2025
//3158. Find the XOR of Numbers Which Appear Twice.
public class LeetCode3158 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(set.contains(i)){
                list.add(i);
            }else {
                set.add(i);
            }
        }
        if(list.size() == 1){
            System.out.println(list.get(0));
            return;
        }
        for(int i=0; i<list.size(); i++) {
            if (list.size() != 0) {
                sum ^= list.get(i);
            }
        }
        System.out.println(sum);
    }
}
