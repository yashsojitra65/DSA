package OOP.SortObject;
import java.util.*;

//Comparable = “I compare myself” (compareTo)
//Comparator = “I compare two others” (compare)
public class example {
    public static void main(String[] args) {
        Student[] s1 = new Student[4];
        s1[0] = new Student(1, "yash", 90.5, 15);
        s1[1] = new Student(2, "CK", 80.7, 20);
        s1[2] = new Student(3, "krish", 98.1, 13);
        s1[3] = new Student(4, "harsh", 66.8, 10);

//        Arrays.sort(s1, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.age - o2.age;
//            }
//        });

//        Arrays.sort(s1, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.charAt(0) - o2.name.charAt(0);
//            }
//        });

        Arrays.sort(s1);
        for (Student s : s1) {
            System.out.println(s.name + " " + s.perc + " " + s.age);
        }
    }
}

class Student implements Comparable<Student> {
    int RollNo;
    String name;
    double perc;
    int age;

    public Student(int No, String name, double perc, int age) {
        this.RollNo = No;
        this.name = name;
        this.perc = perc;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        if (this.name.charAt(0) > s.name.charAt(0)) {
            return 1;
        } else if (this.name.charAt(0) < s.name.charAt(0)) {
            return -1;
        }
        return 0;
//        return (int) (this.perc - s.perc);
    }


//    @Override
//    public int compareTo(Student s) {
//        if(this.perc > s.perc){
//            return 1;
//        } else if (this.perc < s.perc) {
//            return -1;
//        }
//        return 0;
//    }

//    @Override
//    public int compareTo(Student s) {
//        return this.age - s.age;
//    }
}
