package HashTable;
import java.util.*;
//15-08-2023
//2657.Find the Prefix Common Array of Two Arrays.
public class LeetCode2657 {
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};


        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[A.length];

        for(int i=0; i<A.length; i++){
            map.put(A[i],i);
        }
        for(int i=0; i<B.length; i++){
            if(map.containsKey(B[i])){
                int index = map.get(B[i]);
                if(index <= i){
                    ans[i]++;
                }else {
                    ans[index]++;
                }
            }
        }
        for(int i=1; i< ans.length; i++){
            ans[i] += ans[i-1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
