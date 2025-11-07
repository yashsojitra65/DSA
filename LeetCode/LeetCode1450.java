package LeetCode;

//27-02-2023
//1450. Number of Students Doing Homework at a Given Time..
public class LeetCode1450 {
    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        int count = 0;

        for(int i=0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                count++;
            }
        }
        System.out.println(count);
    }
}
