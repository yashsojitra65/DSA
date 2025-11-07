package Matrix;

//12-01-2023
//11. Print mirror image of matrix
public class mirror_image {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,6},
                {2,9,4},
                {7,8,3}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=col-1; j>=0; j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
