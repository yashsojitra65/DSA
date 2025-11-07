package OOP.ImmutableClass;
import java.util.*;

public final class Student {
    public final String name;
    public final int rollNo;
    public final int age;

    public final List<String> friends;

    public Student(String name, int rollNo, int age, List<String> friends) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;

        List<String> list = new ArrayList<>();
        for (String s : friends) {
            list.add(s);
        }
        this.friends = list;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFriends() {
        List<String> list = new ArrayList<>();
        for(String s : friends){
            list.add(s);
        }
        return list;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.age);
        System.out.println(this.friends);
        System.out.println("--------------------------------------");
    }
}

class TestImmutable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ABC");

        Student student = new Student("Yash",10,23,list);
        student.display();

        List<String> list1 = student.getFriends();
        list1.clear();
        System.out.println("Local List : " + list1.size());

        student.display();
    }
}
