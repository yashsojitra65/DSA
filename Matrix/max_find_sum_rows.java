package Matrix;

//12-01-2023
//12.Find highest sum among all rows
public class max_find_sum_rows {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,6},
                {4,9,4},
                {7,8,3}
        };
        int row=matrix.length;
        int col= matrix[0].length;
        int max=0;

        for(int i=0; i<row; i++){
            int sum=0;
            for(int j=0; j<col; j++){
                sum = sum + matrix[i][j];
                if(sum > max){
                    max = sum;
                }
            }
            System.out.println(i + " " + sum);
        }
        System.out.println("highest sum among all rows: " + max);
    }
}
