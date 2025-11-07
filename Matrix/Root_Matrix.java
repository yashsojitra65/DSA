package Matrix;
//10-01-23
//8.Shortest path to reach from [0,0] to [n,n]
public class Root_Matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,1},
                {8,0,2},
                {1,0,3},
        };
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int r=0; r<row; r++){
            for (int c=0; c<col; c++){
                if(r==0 && c==0){
                    continue;
                }
                if(r==0){
                    matrix[r][c] = matrix[r][c] + matrix[r][c-1];
                } else if (c==0) {
                    matrix[r][c] = matrix[r][c] + matrix[r-1][c];
                }else {
                    matrix[r][c] = matrix[r][c] + min(matrix[r-1][c], matrix[r][c-1]);
                }
            }
        }
        System.out.println(matrix[row-1][col-1]);
        System.out.println();
       for (int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
    }
    public static int min(int a,int b){
        if(a<b) {
            return a;
        }else {
            return b;
        }
    }
}
