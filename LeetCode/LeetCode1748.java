package LeetCode;

//27-02-2023
//1748. Sum of Unique Elements.
public class LeetCode1748 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            max = Math.max(arr[i],max);
        }

        int[] count = new int[max+1];

        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        int sum = 0;
        for(int i=0; i<count.length; i++){
            if(count[i] == 1)
                sum += i;
        }
        System.out.println(sum);
    }
}
