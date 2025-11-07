package LeetCode;
//08-08-2023
//2810.Faulty Keyboard.
public class LeetCode2810 {
    public static void main(String[] args) {
        String s = "string";
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c != 'i'){
                sb.append(c);
            }else {
                sb = sb.reverse();
            }
        }
        System.out.println(sb);
    }
}
