package Math;
//26-08-2023
//836.Rectangle Overlap.
public class LeetCode836 {
    public static void main(String[] args) {
        int[] rec1 = {0,0,2,2};
        int[] rec2 = {1,1,3,3};

        System.out.println(Math.min(rec1[2],rec2[2]) > Math.min(rec1[0],rec2[0]) && Math.min(rec1[3],rec2[3]) > Math.min(rec1[1],rec2[1]));
    }
}
