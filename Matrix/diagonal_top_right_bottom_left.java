package Matrix;

public class diagonal_top_right_bottom_left {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,6},
                {4,9,2},
                {7,8,3}
        };
        int row =  matrix.length;
        int col = matrix[0].length;

        for (int i=0; i<row; i++){
            System.out.print(matrix[i][col-1-i] + " ");
        }
    }
}
