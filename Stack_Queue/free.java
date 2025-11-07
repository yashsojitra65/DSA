package Stack_Queue;
import java.util.*;

public class free {
    public static void main(String[] args) {
        String num = "35427";

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                System.out.println(num.substring(0, i + 1));
                return;
            }
        }

        System.out.println("");
    }
}
