package OOP;

public class oop3 {
    public static void main(String[] args) {
        stud s = new stud();
        s.setStudDetails(15,"Yash",92,80,76);
        s.studDetails();
    }
}

class stud{
    private int rollNo;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMark;

    public void setStudDetails(int rollNo,String studName,int mark1,int mark2,int mark3){
        this.rollNo = rollNo;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        calculateTotal();
    }

    public void calculateTotal(){
        totalMark = mark1+mark2+mark3;
    }
    public void studDetails(){
        System.out.println(rollNo + " " + studName + " " + totalMark);
    }
}
