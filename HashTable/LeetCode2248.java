package HashTable;

import java.util.*;
//14-05-2023
//2248. Intersection of Multiple Arrays.
public class LeetCode2248 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3,1,2,4,5},
                {1,2,3,4},
                {3,4,5,6}
        };
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(map.containsKey(matrix[i][j])){
                    map.put(matrix[i][j],map.get(matrix[i][j]) + 1);
                }
                else{
                    map.put(matrix[i][j],1);
                }
            }
        }
        System.out.println(map);
        for(int i=0; i<matrix[0].length; i++){
            if(map.get(matrix[0][i]) == matrix.length){
                arrayList.add(matrix[0][i]);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
