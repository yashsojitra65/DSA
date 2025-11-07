package LeetCode;

//13-03-2023
//496. Next Greater Element I.
public class LeetCode496 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,2,4};
        int[] arr2 = {6,5,4,3,2,1,7};
        int[] ans = new int[arr1.length];

        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    for(int k=j; k< arr2.length; k++){
                        if(arr1[i] < arr2[k]){
                            ans[i] = arr2[k];
                            break;
                        }
                        j++;
                    }
                    if(j == arr2.length){
                        ans[i] = -1;
                    }
                }
            }
        }

        for(int i=0; i< ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
