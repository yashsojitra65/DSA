package HashTable;
import java.util.*;

public class free {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        int pos = 4;
        int j = 0;

        int[] ans = new int[arr.length + 1];

        for (int i = 0; i < ans.length; i++) {
            if (i == pos) {
                ans[i] = n;
            } else {
                ans[i] = arr[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
// if(i == n){
//         list.add(n);
//         list.add(arr[i]);
//         }else {
//         list.add(arr[i]);
//        }

