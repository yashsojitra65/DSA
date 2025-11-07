package LeetCode;
//03-11-2025
//3550. Smallest Index With Digit Sum Equal to Index.
public class LeetCode3550 {
    public static void main(String[] args) {
        int[] arr ={1,10,11};

        for(int i=0; i<arr.length; i++){
            int number = arr[i];
            int sum = 0;
            while (number != 0){
                sum += number % 10;
                number /= 10;
            }
            if(sum == i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
