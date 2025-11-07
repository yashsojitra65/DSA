//20-07-2023
//717.1-bit and 2-bit Characters.
public class LeetCode717 {
    public static void main(String[] args) {
        int[] bits = {1,0,0};

        for(int i=0; i<bits.length; i++){
            if(bits[i] == 1){
                i++;
            }else {
                if(i == bits.length - 1 && bits[i] == 0){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
