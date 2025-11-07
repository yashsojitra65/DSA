package Matrix;

//11-01-2023
//2. Find element from matrix
public class Find_matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {2,5,6},
                {7,8,9},
                {1,6,8},
        };
        int r = matrix.length;
        int c = matrix[0].length;
        int value = 6;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == value) {
                    System.out.println("Value Present");
                    return;
                }
            }
        }
        System.out.println("Value Not present");
    }
}
