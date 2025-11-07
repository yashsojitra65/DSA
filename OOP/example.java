package OOP;

public class example {
    public static void main(String[] args) {
        Address a = new Address("Surat","Gujarat","India");
        int[] marks = {1,5,6,2};
        student s = new student("Yash Sojitra",a,marks);
        System.out.println(s.getName());
        System.out.println(s.getMarks());
        System.out.println(s.Address.getCity());
        s.display();
    }
}
class student{
    private String name;
    Address Address;
    int[] marks;

    public student(String name, Address Address, int[] marks)
    {
        this.name = name;
        this.Address = Address;
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println(Address.city + " " + Address.state + " " + Address.country);
    }
}

class Address{
    public String city;
    public String state;
    public String country;

    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String getCity() {
        return city;
    }

    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
}
