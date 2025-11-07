package LeetCode;

import java.util.*;

public class LeetCode2352 {
    public static void main(String[] args) {
        int[][] grid = {
                {3,2,1},
                {1,7,6},
                {2,7,7}
        };
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                list.add(grid[j][i]);
            }
        }
        System.out.println(list);
    }
}
