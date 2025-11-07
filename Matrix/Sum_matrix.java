package Matrix;

//11-01-2023
//3. Sum of matrix
public class Sum_matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {2,5,6},
                {7,8,9},
                {1,6,8},
        };
        int r = matrix.length;
        int c = matrix[0].length;
        int sum=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
