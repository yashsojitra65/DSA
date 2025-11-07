package LeetCode;
import java.util.*;
//08-08-2023
//2811.Check if it is Possible to Split Array.
public class LeetCode2811 {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        int m = 5;
        LinkedList<Integer> list = new LinkedList<>();

        for(int i : arr){
            list.add(i);
        }

        if(list.size() == 1 || list.size() == 2) {
            System.out.println(true);
            return;
        }
        for(int i=0; i<list.size()-1; i++) {
            int val = list.get(i) + list.get(i+1);
            if(val >= m) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
