package LeetCode;

import java.util.*;
//04-07-2023
//462.Minimum Moves to Equal Array Elements II
public class LeetCode462 {
    public static void main(String[] args) {
        int[] num = {1,10,2,9};

        Arrays.sort(num);
        int left = 0;
        int right = num.length - 1;
        int mid = (left + right) / 2;
        System.out.println(num[mid]);
        int count = 0;

        for(int i=0; i<num.length; i++){
            count += Math.abs(num[mid] - num[i]);
        }
        System.out.print(count);
    }
}
