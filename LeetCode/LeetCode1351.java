package LeetCode;

//24-02-2023
//1351. Count Negative Numbers in a Sorted Matrix.
public class LeetCode1351 {
    public static void main(String[] args) {
        int[][] matrix = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans = 0;

        for(int i=0; i<matrix.length; i++){
            ans += isCount(matrix[i]);
        }
        System.out.println(ans);
    }
    private static int isCount(int[] row){
        int count = 0;
        for(int i=0; i<row.length; i++){
            if(row[i] < 0){
                count++;
            }
        }
        return count;
    }
}
