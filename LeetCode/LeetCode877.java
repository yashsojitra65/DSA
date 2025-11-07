package LeetCode;

import java.util.ArrayList;
//27-05-2023
//877. Stone Game.
public class LeetCode877 {
    public static void main(String[] args) {
        int piles[] = {5,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();

        int k = 0;
        int n = 0;
        for (int i: piles){
            list.add(i);
        }
        for(int i=0; i < piles.length/2; i++){
            int first = list.get(0);
            int last = list.get(list.size() - 1 - i);

            k += Math.max (first, last);
            n += Math.min (first, last);
        }
        System.out.print(k > n);
    }
}
