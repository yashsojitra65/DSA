package Matrix;

//11-01-2023
//10. Search in a row wise and column wise sorted matrix
public class Question10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,6,7,9},
                {10,14,16,19},
                {20,25,30,56}
        };
        int row =  matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int value = 5;
        int bottom = col-1;

        while (top < row && bottom >= 0){
            if(matrix[top][bottom] == value){
                System.out.println("Value is present");
                return;
            }else if (matrix[top][bottom] > value){
                bottom--;
            }else if (matrix[top][bottom] < value){
                top++;
            }
        }
        System.out.println("value is not present");
    }
}
