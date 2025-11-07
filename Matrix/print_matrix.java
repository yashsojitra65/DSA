package Matrix;

//11-01-2023
//1.Print a matrix
public class print_matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {1,5,6},
                {4,9,4},
                {7,8,3}
        };
        int r=matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
