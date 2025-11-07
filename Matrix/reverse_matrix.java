package Matrix;

//11-01-2023
//5. Print matrix in reverse order
public class reverse_matrix {
    public static void main(String[] args){
        int[][] matrix = {
                {2,5,6,5},
                {7,8,9,8},
                {1,6,8,6},
        };
        int r = matrix.length;
        int c = matrix[0].length;
        int temp=0;

//        for(int i=0; i<r; i++){
//            int s = 0;
//            int e = c-1;
//            while (s < e){
//                temp = matrix[i][s];
//                matrix[i][s] = matrix[i][e];
//                matrix[i][e] = temp;
//                s++;
//                e--;
//            }
//        }

        for(int i=r-1; i>=0; i--){
            for(int j=c-1; j>=0; j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++) {
//                System.out.print(matrix[i][j] + " ");;
//            }
//            System.out.println();
//        }

    }
}
