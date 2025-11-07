package LeetCode;

//03-02-2023
//1672. Richest Customer Wealth
public class LeetCode1672 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5},
                {7,3},
                {3,5}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int max = 0;

        for(int i=0; i<row; i++){
            int sum = 0;
            for (int j=0; j<col; j++){
                sum = sum + matrix[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
