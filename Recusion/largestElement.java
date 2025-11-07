package Recusion;
//15-05-2023
//calculate the product of two numbers using recursion.
public class largestElement {
    public static void main(String[] args) {
        int arr[] = {12,45,71,36,5};
        int max = 0;
        System.out.println(largestElement(arr,0,max));

    }
    public static int largestElement(int[] arr,int i,int max){
        if(i == arr.length){
            return max;
        }
        if(arr[i] > max){
            max = arr[i];
        }
        return largestElement(arr,i+1,max);
    }
}
