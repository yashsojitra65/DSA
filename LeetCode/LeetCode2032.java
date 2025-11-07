package LeetCode;

import java.util.ArrayList;
import java.util.List;

//12-03-2023
//2032. Two Out of Three.
public class LeetCode2032 {
    public static void main(String[] args) {
        int[] num1 = {3,1};
        int[] num2 = {2,3};
        int[] num3 = {1,2};
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<num1.length; i++){
            int number = num1[i];
            if(isCheck(number,num2) || isCheck(number,num3)){
                if(!list.contains(number)){
                    list.add(number);
                }
            }
        }

        for(int i=0; i< num2.length; i++){
            int number = num2[i];
            if(isCheck(number,num1) || isCheck(number,num3)){
                if(!list.contains(number)){
                    list.add(number);
                }
            }
        }

        for(int i=0; i< num3.length; i++){
            int number = num3[i];
            if(isCheck(number,num1) || isCheck(number,num2)){
                if(!list.contains(number)){
                    list.add(number);
                }
            }
        }

        System.out.println(list);
    }
    private static boolean isCheck(int number, int[] number1){
        for(int i=0; i<number1.length; i++){
            if(number1[i] == number){
                return true;
            }
        }
        return false;
    }
}
