package OOP;

public class inheritance {
    public static void main(String[] args) {
        emp e = new emp("Yash" ,19, 12000, 10);
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        System.out.println(e.getName());

    }
}
class students {
    private String name;
    private int age;

    public students(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class emp extends students{
    int salary;
    int id;

    public emp(String name, int age, int salary, int id){
        super(name, age);
        this.salary = salary;
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
}
