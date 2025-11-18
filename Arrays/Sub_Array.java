package Arrays;
import java.util.*;
//18-11-2025
//Sub arrays..
public class Sub_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        List<List<Integer>> sub = new ArrayList<>();

//        for(int i=0; i< arr.length; i++){
//            for (int j=i; j< arr.length; j++){
//                System.out.print("[ ");
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");
//                }
//                System.out.println("]");
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j <= arr.length; j++) {
//                int[] sub = Arrays.copyOfRange(arr, i, j);
//                System.out.println(Arrays.toString(sub));
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {

                temp.add(arr[j]);
                sub.add(new ArrayList<>(temp));
            }
        }

        for (List<Integer> list : sub) {
            System.out.println(list);
        }
    }
}
