package LeetCode;

import java.util.ArrayList;
import java.util.List;

//07-03-2023
//412. Fizz Buzz.
public class LeetCode412 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int n = 3;

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            } else if (i%3 == 0) {
                list.add("Fizz");
            } else if (i%5 == 0) {
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);
    }
}
