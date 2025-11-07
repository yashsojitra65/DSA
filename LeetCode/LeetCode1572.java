package LeetCode;

//18-02-2023
//1572. Matrix Diagonal Sum.
public class LeetCode1572 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        int top = 0;
        int letf = 0;

        while (top < row && letf < col){
            sum = sum + matrix[top][letf];
            matrix[top][letf] = 0;
            top++;
            letf = top;
        }
        int bottom = row-1;
        int right = 0;
        while (bottom >= 0 && right < col){
            sum = sum + matrix[bottom][right];
            matrix[bottom][right] = 0;
            bottom--;
            right++;
        }
        System.out.println(sum);
    }
}
