package String;
//29-07-2023
public class String_to_number {
    public static void main(String[] args) {
        String s = "154863";
        int number = 0;

        for (int i=0; i<s.length(); i++){
            int a = s.charAt(i)-'0';
            number = number * 10 + a;
        }
        System.out.println(number);
    }
}
