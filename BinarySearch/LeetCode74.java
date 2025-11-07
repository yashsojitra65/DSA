package BinarySearch;
//07-07-2023
//74.Search a 2D Matrix.
public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i< row; i++) {
            int[] arr = new int[col];
            for (int j = 0; j < col; j++) {
                arr[j] = matrix[i][j];
            }
            if(helper(0, arr.length-1, arr,13)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
    public static boolean helper(int left,int right,int[] arr,int value){
        while (left <= right){
            int mid = (left+right) / 2;

            if(arr[mid] < value){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
            if(arr[mid] == value){
                return true;
            }
        }
        return false;
    }
}
