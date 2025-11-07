package LeetCode;
import java.util.*;
//15-12-2023
//2857.Count Pairs of Points With Distance k.
public class LeetCode2857 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int k = 5;
        int count = 0;

        List<Integer> sublist1 = new ArrayList<>();
        sublist1.add(1);
        sublist1.add(2);
        list.add(sublist1);

        List<Integer> sublist2 = new ArrayList<>();
        sublist2.add(4);
        sublist2.add(2);
        list.add(sublist2);

        List<Integer> sublist3 = new ArrayList<>();
        sublist3.add(1);
        sublist3.add(3);
        list.add(sublist3);

        List<Integer> sublist4 = new ArrayList<>();
        sublist4.add(5);
        sublist4.add(2);
        list.add(sublist4);

        int[][] arr = new int[list.size()][2];
        for(int i=0; i<arr.length; i++){
            arr[i][0] = list.get(i).get(0);
            arr[i][1] = list.get(i).get(1);
        }

        for(int i=0; i<arr.length-1; i++){

            int x1 = arr[i][0];
            int y1 = arr[i][1];

            for(int j=i+1; j<arr.length; j++){
                int x2 = arr[j][0];
                int y2 = arr[j][1];

                int val = (x1 ^ x2) + (y1 ^ y2);
                if(val == k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
