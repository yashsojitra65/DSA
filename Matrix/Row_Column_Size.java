package Matrix;

//11-01-2023
//4. Find row and column size from given matrix
public class Row_Column_Size {
    public static void main(String[] args){
        int[][] matrix = {
                {2,5,6},
                {7,8,9},
                {1,6,8},
        };
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println(r);
        System.out.println(c);
    }
}
