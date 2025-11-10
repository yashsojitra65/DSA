package OOP.Serialization;
import java.io.*;

class Serial {
    public static void main(String[] args) {
        Student student = new Student("Yash","yash@gmial.com",23,"surat");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println("Object stated..");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
