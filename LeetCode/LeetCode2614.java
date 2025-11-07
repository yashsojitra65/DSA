package LeetCode;

public class LeetCode2614 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
        };
        int max = 0;
        for(int i=0;i<matrix.length; i++){
            if(isPrime(matrix[i][i])){
                max = Math.max(matrix[i][i],max);
            }
        }
        for(int i=0; i<matrix.length; i++){
            if(isPrime(matrix[i][matrix.length - i - 1])){
                max = Math.max(matrix[i][matrix.length - i -1],max);
            }
        }
        System.out.println(max);
    }
    public static boolean isPrime(int num){
        if(num < 2){
            return true;
        }
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
