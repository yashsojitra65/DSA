package LeetCode;
import java.util.*;
//15-12-2023
//1436.Destination City.
public class LeetCode1436 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        List<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        list.add(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        list.add(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Sao Paulo");
        list.add(list3);

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).get(0));
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).get(1);
            if (!set.contains(s)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("");
    }
}
