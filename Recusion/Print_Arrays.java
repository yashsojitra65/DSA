package Recusion;
//08-05-2023
//5. Print the array elements using recursion.
public class Print_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 0;
        num(arr,k);
    }
    public static void num(int[] arr,int k){
        if(k == arr.length){
            return;
        }
        System.out.print(arr[k] + " ");
        num(arr, k+1);
    }
}
