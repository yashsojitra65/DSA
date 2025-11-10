package OOP.Serialization;

import java.io.*;

public class Student implements Serializable {
    private String Name;
    private String email;
    private int age;
    private String Address;

    public Student(String name, String email, int age, String address) {
        this.Name = name;
        this.email = email;
        this.age = age;
        this.Address = address;
    }
    public Student(){};

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}


