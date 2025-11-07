package LeetCode;

import java.util.Arrays;

//18-02-2003
//2037. Minimum Number of Moves to Seat Everyone.
public class LeetCode2037 {
    public static void main(String[] args) {
        int[] sets = {3,1,5};
        int[] students = {2,7,4};
        int n = sets.length;
        int count = 0;
        Arrays.sort(sets);
        Arrays.sort(students);

        for(int i=0; i<n; i++){
            if(sets[i] > students[i]){
                count = count + sets[i] - students[i];
            }else {
                count = count + students[i] - sets[i];
            }
        }
        System.out.println(count);
    }
}
