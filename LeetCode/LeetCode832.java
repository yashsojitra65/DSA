package LeetCode;
//27-07-2023
//832.Flipping an Image.
public class LeetCode832 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        for(int i=0; i<matrix.length; i++){
            int left = 0;
            int right = matrix.length - 1;

            while (left < right){
                int k = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = k;
                left++;
                right--;
            }
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] = 0;
                } else if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
