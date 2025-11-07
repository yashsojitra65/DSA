package OOP.Custom;
import java.util.*;

public class CustomHaseCode {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        OOP.Custom.Student s1 = new OOP.Custom.Student(1, "Yash");
        OOP.Custom.Student s2 = new OOP.Custom.Student(2, "Yash");
        OOP.Custom.Student s3 = new OOP.Custom.Student(3, "Yash");
        OOP.Custom.Student s4 = new OOP.Custom.Student(4, "Yash");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

        for (OOP.Custom.Student s : set) {
            System.out.print(s.id + " ");
            System.out.println(s.name);
        }
    }
}
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 35;
        int result = 50;
        result = prime * result + id;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        // type casting of the argument.
        OOP.Custom.Student other = (OOP.Custom.Student) obj;

        // comparing the state of argument with
        // the state of 'this' Object
        if (id != other.id) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}

