package LeetCode;
//30-09-2023
//1995.Count Special Quadruplets.
public class LeetCode1995 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        int count = 0;

        for(int i=0; i<arr.length-3; i++){
            for(int j=i+1; j< arr.length-2; j++){
                for(int k=j+1; k< arr.length-1; k++) {
                    for (int f=k+1; f<arr.length; f++) {
                        if (arr[i] + arr[j] + arr[k] == arr[f]){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
