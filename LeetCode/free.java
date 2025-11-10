package LeetCode;
import java.util.*;
import java.util.stream.*;

public class free {
    public static void main(String[] args) {
        int n = 537;
        ArrayList<Integer> list = new ArrayList<>();

        int temp = 1;
        while(n > 0) {
            int k = n % 10;
            if(k != 0) {
                list.add(k * temp);
            }
            n /= 10;
            temp *= 10;
        }
        System.out.println(list);
//        int[] arr = list.stream()
//                        .sorted(Collections.reverseOrder())
//                        .mapToInt(i -> i.intValue())
//                        .toArray();
        int[] arr = new int[list.size()];
        Collections.sort(list,Collections.reverseOrder());

        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}



