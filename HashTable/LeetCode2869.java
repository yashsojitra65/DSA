package HashTable;
import java.util.*;

public class LeetCode2869 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        int k = 2;

        HashSet<Integer> set =new HashSet<>();
        int size = list.size();
        int n = k;
        for(int i=0;i<size;i++) {
            int x = (list.get(size - 1 - i));
            if ((set.add(x) == true) && (x <= n)) {
                k = k - 1;
            }
            if (k == 0) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(list.size());
    }
}
