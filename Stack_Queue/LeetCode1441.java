package Stack_Queue;
import java.util.*;
//18-09-2023
//1441.Build an Array With Stack Operations.
public class LeetCode1441 {
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
        int j = 0;
        List<String> list = new ArrayList<>();
        int idx = 0;
        for(int i=1; i<= n; i++){
            if(idx == target.length){
                break;
            }
            if(target[idx] == i){
                list.add("push");
                idx++;
            }else {
                list.add("push");
                list.add("pop");
            }
        }
        System.out.println(list);
    }
}
