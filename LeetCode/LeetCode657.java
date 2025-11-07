package LeetCode;

//02-03-2023
//657. Robot Return to Origin.
public class LeetCode657 {
    public static void main(String[] args) {
        String s = "UD";
        int x = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'U'){
                y++;
            }else if (s.charAt(i) == 'D'){
                y--;
            } else if (s.charAt(i) == 'R') {
                x++;
            }else {
                x--;
            }
        }
        if(x == 0 && y == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
