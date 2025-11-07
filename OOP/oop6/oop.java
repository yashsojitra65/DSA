package OOP.oop6;
import java.util.Arrays;

public class oop {
    public static void main(String[] args) {
        student s1 = new student(101,"Yash",90,80,70,60,50);
        student s2 = new student(102,"Yogi",80,46,89,90,99);
        student s3 = new student(103,"Jay",79,63,48,96,98);
        student s4 = new student(104,"CK",86,89,56,76,63);
        student s5 = new student(105,"ABC",79,62,30,46,89);

        int arr[] = new int[5];
        arr[0] = s1.totalMarks;
        arr[1] = s2.totalMarks;
        arr[2] = s3.totalMarks;
        arr[3] = s4.totalMarks;
        arr[4] = s5.totalMarks;

        Arrays.sort(arr);
        for(int i= arr.length-1; i>1; i--){
            System.out.println(arr[i] + " ");
        }
    }
}
class student{
    private int rollNo;
    private String name;
    private int marks1, marks2, marks3, marks4, marks5;
    int totalMarks;

    public student(int rollNo,String name,int marks1,int marks2,int marks3,int marks4,int marks5){
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
        TotalMarks();
    }

    public void TotalMarks(){
        totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
    }
}