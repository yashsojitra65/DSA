package LeetCode;

//28-04-2023
//66.Plus One.
public class LeetCode66 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        for(int i= arr.length - 1; i>=0; i--){
            if(arr[i] != 9){
                arr[i]++;
                break;
            }else {
                arr[i] = 0;
            }
        }
        if(arr[0] == 0){
            int[] ans = new int[arr.length + 1];
            arr[0] = 1;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //        for(int i=0; i< arr.length; i++){
//            if(i == n){
//                if(arr[i] == 9){
//                    ans[i] = 1;
//                    i++;
//                    ans[i] = 0;
//                    break;
//                }
//                arr[i] = arr[i] + 1;
//                ans[i] = arr[i];
//            }else {
//                ans[i] = arr[i];
//            }
//        }
    }
}
