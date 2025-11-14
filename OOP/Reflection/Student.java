package OOP.Reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//14-11-2025
//Java Reflection
class School {
    private final String name;

    private final int age;

    public School(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    private String print() {
        return "School {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Student {
    public static void main(String[] args) {
        School school = new School("ABC", 2);
        Field[] field = school.getClass().getDeclaredFields();
        System.out.println("Before field change: " + school.getName());

//        for (Field f : field) {
//            System.out.println(f.getName());
//        }
        try {
            for (Field f : field) {
                if (f.getName().equals("name")){
                    f.setAccessible(true);
                    f.set(school, "Yash");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("After field change: " + school.getName());

        System.out.println("Before field change Age: " + school.getAge());
        try {
            for(Field f : field){
                if(f.getType() == int.class){
                    f.setAccessible(true);
                    f.setInt(school,24);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After field change Age: " + school.getAge());

        System.out.println("----------------------------------------------------------------------------------------");

        Method[] methods = school.getClass().getDeclaredMethods();

//        for (Method m : methods) {
//            System.out.println(m.getName());
//        }

        try {
            for (Method m : methods) {
                if (m.getName().equals("display")) {
                    m.setAccessible(true);
                    m.invoke(school);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------------------ Method return type ------------------------");
        try {
            for (Method m : methods) {
                if (m.getName().equals("print")) {
                    m.setAccessible(true);
                    Object obj = m.invoke(school);
                    System.out.println(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
