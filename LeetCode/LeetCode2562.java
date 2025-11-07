package LeetCode;

//20-03-2023
//2562. Find the Array Concatenation Value.
public class LeetCode2562 {
    public static void main(String[] args) {
        int[] arr = {7,52,2,4};
        String s = "";
        int sum = 0;
        int i = 0;
        int j = arr.length-1;

        while (i <= j){
            s =  String.valueOf(arr[i]);
            s += String.valueOf(arr[j]);
            if(i == j){
                sum += arr[i];
                break;
            }
            sum += Integer.valueOf(s);
            i++;
            j--;
        }
        System.out.println(sum);
    }
}
