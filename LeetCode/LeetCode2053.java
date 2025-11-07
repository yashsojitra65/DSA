package LeetCode;

//16-03-2023
//2053. Kth Distinct String in an Array.
public class LeetCode2053 {
    public static void main(String[] args) {
        char[] arr = {'d', 'b', 'c', 'b', 'c', 'a'};
        int[] arr1 = new int[128];
        int ascii = 0;

        for(int i=0; i<arr.length; i++){
            ascii = (int)arr[i];

            if(arr1[ascii] == 0){
                arr1[ascii] = 1;
            } else if (arr1[ascii] == 1) {
                arr1[ascii] = -1;
            }
        }

        for(int i=0; i<arr.length; i++){
            ascii = (int) arr[i];

            if(arr1[ascii] == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
