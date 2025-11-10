package OOP.Serialization;
import java.io.*;

public class Deserial {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Student student  = (Student) objectInputStream.readObject();
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Email: " + student.getEmail());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Student Address: " + student.getAddress());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
