package LeetCode;
import java.util.*;
//19-08-2023
//1773.Count Items Matching a Rule.
public class LeetCode1773 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> firstItem = new ArrayList<>();
        firstItem.add("phone");
        firstItem.add("blue");
        firstItem.add("pixel");
        list.add(firstItem);

        List<String> secondItem = new ArrayList<>();
        secondItem.add("computer");
        secondItem.add("silver");
        secondItem.add("phone");
        list.add(secondItem);

        List<String> thirdItem = new ArrayList<>();
        thirdItem.add("phone");
        thirdItem.add("gold");
        thirdItem.add("iphone");
        list.add(thirdItem);

        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        int index = 0;
        if (ruleKey.equals("color")){
            index = 1;
        }
        if (ruleKey.equals("name")){
            index = 2;
        }
        for (List<String> i : list){
            if (i.get(index).equalsIgnoreCase(ruleValue)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
