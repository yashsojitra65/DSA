package Matrix;

public class rootArray {
    public static void main(String[] args){
        int arr[][] = {{1,5,6},
                       {7,8,3},
                       {9,6,4}};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
