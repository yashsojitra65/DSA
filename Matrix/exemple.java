package Matrix;

public class exemple {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row = mat.length;
        int col = mat[0].length;
//        printMatrix(mat,row,col);
//        find(mat,row,col,70);
//        int sum = sumofMatrix(mat,row,col);
//        System.out.println(sum);
//        findvalue(mat);
//        printrevser(mat,row,col);
//        traverseRow(mat,row,col);
//        printZigzag(mat,row,col);
//        printMirrror(mat,row,col);
//        printHighestSumOfRow(mat,row,col);
//        printHighestSumOfCol(mat,row,col);
//        deleteMaxElementRow(mat,row,col);
//        deleteMaxElementCol(mat,row,col);
//        diagonalTopLeftToRightBottom(mat,row,col);
//        diagonalTopRightToLeftBottom(mat,row,col);
//        int sumOfDiagonal =  sumOfDiagonal(mat,row,col);
//        System.out.println(sumOfDiagonal);
//        binarySearch(mat,row,col);
        searchSortedRowAndCol(mat,row,col);
//        matrixDiagonalSum(mat,row,col);
//         shortestPath(mat,row,col);
//         spiralMatrix(mat);

    }

    private static void spiralMatrix(int[][] mat) {
        int startRow = 0 ;
        int startCol = 0;
        int endRow = mat.length-1;
        int endCol = mat[0].length-1;


        while (startRow <= endRow && startCol <= endCol){
            //top
            for(int j =startCol;j<=endCol;j++){

                System.out.print(mat[startRow][j] + " ");
            }

            //right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(mat[i][endCol] + " ");
            }

            //bottom
            for (int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(mat[endRow][j] + " ");
            }

            //left
            for (int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(mat[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();

    }



    private static void shortestPath(int[][] mat, int row, int col) {
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(i==0 && j==0 ){
                    continue;
                }else if (i==0){
                    mat[i][j] += mat[i][j-1];
                } else if (j==0) {
                    mat[i][j] += mat[i-1][j];
                } else {
                    mat[i][j] += Math.min(mat[i][j-1],mat[i-1][j]);
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }

    private static void matrixDiagonalSum(int[][] mat, int row, int col) {
        int sum =0;
        int sum2 =0;
        for(int i=0;i<row;i++){
            sum += mat[i][i];
            sum2 += mat[i][col-i-1];
        }
        System.out.println("First Diagonals : " + sum + "  Secound Diagonals : " + sum2 );
        System.out.println(sum2+sum);

    }

    private static void searchSortedRowAndCol(int[][] mat, int row, int col) {
        int value = 5;
        int r= 0,c=col-1;

        while (c >= 0 && r <= row -1 ){
            if(mat[r][c]==value){
                System.out.println("Present");
                return;
            } else if (value < mat[r][c]) {
                c--;
            }else {
                r++;
            }
        }
        System.out.println("Not Present");
    }


    private static void binarySearch(int[][] mat, int row, int col) {
        int top =0, bottom = row -1;
        int value = 2;
        int rowTOBeSearched = -1;
        while (top <= bottom){
            int mid = (top+bottom)/2;
            if(mat[mid][0] <= value && mat[mid][col-1] >= value){
                rowTOBeSearched = mid;
                break;
            } else if (value < mat[mid][0]) {
                bottom = mid - 1;
            }else {
                top = mid + 1;
            }
        }

        if(rowTOBeSearched == -1){
            System.out.println("Value is not Present");
            return;
        }
        int left =0 , right = col -1;
        while (left <= right){
            int mid = (left+right) / 2;
            if(mat[rowTOBeSearched][mid] == value){
                System.out.println("Value is Present");
                return;
            } else if (mat[rowTOBeSearched][mid] < value) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
    }


    private static int  sumOfDiagonal(int[][] mat, int row, int col) {
        int sum = 0 ;
        for(int i = 0; i<row;i++){
            sum += mat[i][i];
            if(i!=col-i-1){
                sum += mat[i][col-i-1];
            }
        }
        return sum;
    }


    private static void diagonalTopRightToLeftBottom(int[][] mat, int row, int col) {
        for(int i=0;i<row;i++){
            System.out.println(mat[i][col-i-1]);
        }
    }

    private static void diagonalTopLeftToRightBottom(int[][] mat, int row, int col) {
        for(int i=0;i<row;i++){
            System.out.println(mat[i][i]);
        }
    }

    private static void deleteMaxElementCol(int[][] mat, int row, int col) {
        for(int i=0;i<row;i++) {
            int maxIndex = 0;
            int maxElement = 0;
            for (int j = 1; j < col; j++) {
                if (mat[j][i] > maxElement) {
                    maxIndex = j;
                    maxElement = mat[j][i];
                }
            }
            for (int j = maxIndex; j < col-1; j++) {
                mat[j][i] = mat[j][i+1];
            }
            mat[i][row-1] = 0;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=0){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void deleteMaxElementRow(int[][] mat, int row, int col) {
        for(int i=0;i<row;i++) {
            int maxIndex = 0;
            int maxElement = 0;
            for (int j = 1; j < col; j++) {
                if (mat[i][j] > maxElement) {
                    maxIndex = j;
                    maxElement = mat[i][j];
                }
            }
            for (int j = maxIndex; j < col-1; j++) {
                mat[i][j] = mat[i][j+1];
            }
            mat[i][col-1] = 0;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=0){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    private static void printHighestSumOfCol(int[][] mat, int row, int col) {
        int highestSum = Integer.MIN_VALUE;

        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<col;j++){
                sum += mat[j][i];
            }
            if(highestSum < sum){
                highestSum = sum;
            }
        }
        System.out.println(highestSum);
    }

    private static void printHighestSumOfRow(int[][] mat, int row, int col) {
        int highestSum = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            int sum =0;
            for (int j=0;j<col;j++){
                sum +=mat[i][j];
            }
            if(highestSum < sum){
                highestSum = sum;
            }
        }
        System.out.println(highestSum);
    }

    private static void printMirrror(int[][] mat, int row, int col) {
        for(int i=0;i<row;i++){
            for (int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    private static void printZigzag(int[][] mat, int row, int col) {
        int evenrow = 0;
        int oddrow =1;

        while (evenrow < row){
            for(int i=0;i<col;i++){
                System.out.print(mat[evenrow][i]+" ");
            }
            System.out.println();
            evenrow +=2;
            if(oddrow < row){
                for(int i=col-1;i>=0;i--){
                    System.out.print(mat[oddrow][i]+ " ");
                }
                System.out.println();
                oddrow +=2;
            }
        }
    }

    private static void traverseRow(int[][] mat, int row, int col) {
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }

    private static void printrevser(int[][] mat, int row, int col) {
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findvalue(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        System.out.println("Row  = "+row + " Col   = " + col);
    }

    private static int sumofMatrix(int[][] mat, int row, int col) {
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    private static void find(int[][] mat, int row, int col ,int value) {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]== value){
                    System.out.println("It's Present");
                    return;
                }
            }
        }
        System.out.println("It's Not Present");
    }

    private static void printMatrix(int[][] mat, int row ,int col) {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
