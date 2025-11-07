package LeetCode;

//24-04-2023
//914. X of a Kind in a Deck of Cards.
public class LeetCode914 {
    public static void main(String[] args) {
        int[] deck = {1,1,1,2,2,2,3,3};
        int[] freq = new int[10001];

        for(int i : deck){
            freq[i]++;
        }
        boolean ans = true;
        for (int j=2; j<= deck.length; j++){
            ans = true;
            for(int count : freq){
                if(count % j > 0){
                    ans = false;
                    break;
                }
            }
            if(ans){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
