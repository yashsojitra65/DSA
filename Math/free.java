package Math;

import java.util.Arrays;

public class free {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};

        int maxAns = Integer.MIN_VALUE;
        int minAns = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxAns) {
                maxAns = arr[i];
            }
            if(arr[i] < minAns) {
                minAns = arr[i];
            }
        }

        int max = 0;
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Difference between min and minAns: " + (min - minAns));
    }
}
//        int maxAns = 0;
//        int minAns = Integer.MAX_VALUE;
//
//        maxAns = isMax(arr,maxAns);
//        minAns = isMin(arr,minAns);
//
//
//        int max = 0;
//        int min = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                min = max;
//                max = arr[i];
//            } else if (arr[i] > min) {
//                min = arr[i];
//            }
//        }
//       System.out.println(min);
//       System.out.println(max);
//       System.out.println(min - minAns);
//    }
//
//    private static int isMin(int[] arr,int min){
//        for(int i=0; i< arr.length; i++){
//            min = Math.min(arr[i], min);
//        }
//        return min;
//    }
//    private static int isMax(int[] arr,int max){
//        for(int i=0; i< arr.length; i++){
//            max = Math.max(arr[i],max);
//        }
//        return max;
//    int[] arr = {2,2,2,3,3};
//    int n = arr.length;
//    int even = 0;
//    int odd = 0;
//    int max = Integer.MIN_VALUE;
//
//        for(int i=0; i<n; i++){
//        if(arr[i] % 2 == 0){
//        even++;
//        }else {
//        odd++;
//        }
//        }
//        max = Math.max(even,odd);
//        System.out.println(max);



