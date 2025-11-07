package LeetCode;
//20-09-2023
//2833.Furthest Point From Origin.
public class LeetCode2833 {
    public static void main(String[] args) {
        String moves = "L_RL__R";
        int L = 0;
        int R = 0;
        int count = 0;

        for(char c : moves.toCharArray()){
            if(c == 'L'){
                L++;
            }else if(c == 'R'){
                R++;
            }else {
                count++;
            }
        }
        System.out.println(Math.abs(L - R) + count);
    }
}