package LeetCode;
//03-08-2023
//2798.Number of Employees Who Met the Target.
public class LeetCode2798 {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int count = 0;

        for(int i : hours){
            if(i >= target){
                count++;
            }
        }
        System.out.println(count);
    }
}
