package Matrix;

//10-01-2023
//9. Find element from sorted matrix : Binary search
public class Binary_search_matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,4},
                {7,9,10},
                {14,17,19},
                {30,32,66}};
        int row = matrix.length;
        int col = matrix[0].length;
        int value = 32;
        int top = 0;
        int bottom = row-1;
        int rowTobeSearch = -1;

        while(top <= bottom){
            int mid = (top+bottom)/2;
            if(value >= matrix[mid][0] && value <= matrix[mid][col-1]){
                rowTobeSearch = mid;
                break;
            } else if (value > matrix[mid][0]) {
                top = mid + 1;
            }else {
                bottom = mid-1;
            }
        }
        if(rowTobeSearch == -1){
            System.out.println("value not present");
            return;
        }
        int left=0, right=col-1;
        while (left <= right){
            int mid = (left+right)/2;
            if(value == matrix[rowTobeSearch][mid]){
                System.out.println("value is present");
                return;
            } else if (value > matrix[rowTobeSearch][mid]) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        System.out.println("value not present");
    }
}
