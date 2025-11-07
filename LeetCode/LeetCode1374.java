package LeetCode;
//10-08-2023
//1374.Generate a String With Characters That Have Odd Counts.
public class LeetCode1374 {
    public static void main(String[] args) {
        int n = 4;
        char[] arr = new char[n];

        for (int i=0; i<n; i++){
            arr[i] = 'a';
        }
        if(n % 2 == 0){
            arr[0] = 'b';
        }
        System.out.println(String.valueOf(arr));
    }
}
