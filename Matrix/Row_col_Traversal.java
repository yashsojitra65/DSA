package Matrix;

//11-01-2023
//6. Row / column wise traversal
public class Row_col_Traversal {
    public static void main(String[] args){
        int[][] matrix = {
                {2,5,6,5},
                {7,8,9,6},
                {1,6,8,7},
        };
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
