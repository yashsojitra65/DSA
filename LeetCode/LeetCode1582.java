package LeetCode;

//08-06-2023
//1582.Special Positions in a Binary Matrix.
public class LeetCode1582 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,0},
                {0,0,1},
                {1,0,0},
        };
        int count = 0;

        for(int i=0; i<matrix.length; i++){
            int idx = 0,col = 0,row = 0;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 1) {
                    idx = j;
                    break;
                }
            }
            for(int k=0; k<matrix[0].length; k++){
                if(matrix[i][k] == 1){
                    col++;
                }
            }
            for(int k=0; k<matrix.length; k++){
                if(matrix[k][idx] == 1){
                    row++;
                }
            }
            if(col == 1 && row == 1){
                count++;
            }
        }
        System.out.print(count);
    }
}
