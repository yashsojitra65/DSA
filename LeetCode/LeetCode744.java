package LeetCode;
//22-07-2023
//744.Find Smallest Letter Greater Than Target.
public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';

        for(char c : letters){
            if(c > target){
                System.out.println(c);
                return;
            }
        }
        System.out.println(letters[0]);
    }
}
