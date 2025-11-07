package LeetCode;

//24-04-2023
//48. Rotate Image.
public class LeetCode48 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] mat = new int[row][col];
        int k = 0;

        for(int i=0; i<row; i++){
            k = 0;
            for(int j=col-1; j>=0; j--) {
                mat[i][k] = matrix[j][i];
                k++;
            }
        }
//        for (int i=0; i< mat.length; i++){
//            for (int j=0; j<mat[0].length; j++){
//                matrix[i][j] = mat[i][j];
//            }
//        }

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
