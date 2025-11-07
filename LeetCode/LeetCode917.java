package LeetCode;

//06-07-2023
//917.Reverse Only Letters.
public class LeetCode917 {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;

        while (i < j){
            if(!Character.isLetter(c[i])){
                i++;
            } else if (!Character.isLetter(c[j])) {
                j--;
            }else {

                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(c));
    }
}
