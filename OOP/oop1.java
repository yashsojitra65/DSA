package OOP;

//02-02-2023
public class oop1 {
    public static void main(String[] args) {
        Holiday h[] = new Holiday[5];
        //Holiday h1 = new Holiday("Independence Day",15,"July");

//        h1.setDay(12);
//        h1.setMonth("October");
//        h1.setName("Yash");
//        System.out.println(h1.getName());
//        System.out.println(h1.getDay());
//        System.out.println(h1.getMonth());
//        System.out.println(h1.inSameMonth("Utrayan"));
         h[0] = new Holiday("Navratri",10,"October");
         h[1] = new Holiday("Uttrayan",14,"January");
         h[2] = new Holiday("Diwali",1,"November");
         h[3] = new Holiday("Navratri", 10, "October");
         h[4] = new Holiday("Independence Day", 15,"January");

        System.out.println(Holiday.avgDate(h));
    }
}

class Holiday {
    private String name;
    private static int day;
    private String month;

    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(String month){
        this.month = month;
    }
    public String getName(){
        return name;
    }
    public int getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
     public Boolean inSameMonth(String month){
        if(this.month.equals(month)){
            return true;
        }
        else {
            return false;
        }
     }
     public static double avgDate(Holiday[] h){
        double sum = 0;
        for(int i=0; i<h.length; i++){
            sum = sum + h[i].day;
        }
        return ((double) sum/day);
     }
}
