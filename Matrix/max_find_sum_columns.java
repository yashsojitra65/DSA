package Matrix;

//12-01-2023
//13. Find highest sum among all columns
public class max_find_sum_columns {
    public static void main(String[] args) {
        int[][] matrix = {
                {16, -15, 64},
                {42, 6, -40},
                {-16, 15, 13},
                {1, 2, 3}
        };
        int row = matrix.length;
//        System.out.println(row);
        int col = matrix[0].length;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum = sum + matrix[j][i];

//                System.out.println(i + " " + sum);
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println("highest sum among all columns: " + max);
        }
    }
}
