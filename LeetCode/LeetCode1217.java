package LeetCode;
//27-08-2023
//1217.Minimum Cost to Move Chips to The Same Position.
public class LeetCode1217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int odd = 0;
        int even = 0;

        for(int i : arr){
            if(i % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(Math.min(even,odd));
    }
}
