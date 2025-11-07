package Matrix;

//25-01-2023
//Spiral Matrix
public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int total = row * col;

        int sRow = 0;
        int sCol = 0;
        int eRow = row - 1;
        int eCol = col - 1;

        while (count < total){

            //Print starting row
            for(int i=sCol; count < total && i<=eCol; i++){
                System.out.print(matrix[sCol][i] + " ");
                count++;
            }
            sRow++;
            //Print ending col
            for(int i=sRow; count < total && i<=eRow; i++){
                System.out.print(matrix[i][eCol] + " ");
                count++;
            }
            eCol--;
            //Print ending row
            for(int i=eCol; count < total && i>=sCol; i--){
                System.out.print(matrix[eRow][i] + " ");
                count++;
            }
            eRow--;
            //Print starting column
            for(int i=eRow; count < total && i>=sRow; i--){
                System.out.print(matrix[i][sCol] + " ");
                count++;
            }
            sCol++;
        }
    }
}
