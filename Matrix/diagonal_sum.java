package Matrix;

//12-01-2023
//15. Matrix diagonal sum of both direction.
public class diagonal_sum {
    public static void main(String[] args) {
        int matrix[][] ={
                      {2,3,4},
                      {5,7,8},
                      {9,8,7},
                };
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        int top =0;
        int left = 0;

        while(top < row && left < col){
            sum = sum + matrix[top][left];
            matrix[top][left]=0;
            top++;
            left = top;
        }
        int bottom = row-1;
        int right = 0;
        while(bottom >= 0 && right < col){
            sum = sum + matrix[bottom][right];
            matrix[bottom][right]=0;
            bottom--;
            right++;
        }
        System.out.println(sum);
    }
}
