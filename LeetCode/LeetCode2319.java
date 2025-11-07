package LeetCode;
//27-10-2023
//2139.Minimum Moves to Reach Target Score.
public class LeetCode2319 {
    public static void main(String[] args) {
        int target = 19;
        int maxDoubles = 2;
        int count = 0;

        while(target > 1){
            if(target % 2 != 0){
                target -= 1;
                count++;
            } else if (target % 2 == 0 && maxDoubles > 0) {
                target /= 2;
                count++;
                maxDoubles--;
            }else {
                count += target - 1;
                break;
            }
        }
        System.out.println(count);
    }
}