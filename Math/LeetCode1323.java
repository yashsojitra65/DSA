package Math;

//24-02-2023
//1323. Maximum 69 Number..
public class LeetCode1323 {
    public static void main(String[] args) {
        int num = 9669;
        int n = num;
        int max = 0;
        int j = 0;
        int count = 0;
        while (num != 0){
            max = num%10;
            num = num/10;
            count++;
        }
        int arr[] = new int[count];
        int k = 0;
        for (int i=0; i<arr.length; i++){
            k++;
            arr[arr.length-k] = n%10;
            n = n/10;
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i]==6 && j==0){
                arr[i] = 9;
                j++;
            }
        }
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = 10*result + arr[i];
        }
        System.out.println(result);
    }
}
