package LeetCode;
//16-08-2023
//2678.Number of Senior Citizens.
public class LeetCode2678 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count = 0;

        for(String s : details){
            int age = Integer.parseInt(s.substring(11,13));
            if(age > 60){
                count++;
            }
        }
        System.out.println(count);
    }
}
