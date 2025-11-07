package HashTable;

import java.util.*;
//29-05-2023
//2103. Rings and Rods.
public class LeetCode2103 {
    public static void main(String[] args) {
        String r = "B0B6G0R6R0R6G9";
        int[][] ringRod = new int[10][3];

        for(int i=0; i<r.length(); i+=2){
            int rod = (int)(r.charAt(i + 1) - '0');
            char ch = r.charAt(i);
            if(ch == 'R')
                ringRod[rod][0] = 1;
            else if(ch == 'G')
                ringRod[rod][1] = 1;
            else if(ch == 'B')
                ringRod[rod][2] = 1;
        }
        int count = 0;
        for(int[] arr : ringRod){
            boolean flag = true;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }
        System.out.println(count);

//        HashSet<Integer> red = new HashSet<>();
//        HashSet<Integer> green = new HashSet<>();
//        HashSet<Integer> blue = new HashSet<>();
//
//        for(int i=0; i<rings.length(); i+=2){
//            if(rings.charAt(i) == 'R'){
//                red.add(rings.charAt(i + 1) - '0');
//            }
//            if(rings.charAt(i) == 'G'){
//                green.add(rings.charAt(i + 1) - '0');
//            }
//            if(rings.charAt(i) == 'B'){
//                blue.add(rings.charAt(i + 1) - '0');
//            }
//        }
//        int count = 0;
//        for(int i=0; i<=9; i++){
//            if(red.contains(i) && green.contains(i) && blue.contains(i)){
//                count++;
//            }
//        }
//        System.out.print(count);
    }
}
