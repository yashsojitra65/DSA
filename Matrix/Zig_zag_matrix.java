package Matrix;

//11-01-2023
//7. Print matrix in zig zag fashion
public class Zig_zag_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,5,6},
                {7,8,9},
                {1,6,8},
                {6,2,4},
        };
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<r; i++){
            if (i % 2 == 0) {
                for(int j=0;j<c;j++){
                    System.out.print(matrix[i][j] + " ");
                }
            }else{
                for(int j=c-1;j>=0;j--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
