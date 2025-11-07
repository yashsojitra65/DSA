package OOP.In1Question;


interface SIM2G{
    public abstract void call();
    public abstract void SMS();
}
interface SIM3G{
    public abstract void videoCall();
}
class Airtel implements SIM2G{
    public void call(){
        System.out.println("Calling");
    }
    public void SMS(){
        System.out.println("SMS");
    }
}
class Airtel3G extends Airtel implements SIM3G{
    public void videoCall(){
        System.out.println("videoCall");
    }
}
public class Customer {
    public static void main(String[] args) {
        Airtel a = new Airtel();
        a.call();
        a.SMS();
        System.out.println("====================================================================");
        Airtel3G b = new Airtel3G();
        b.call();
        b.SMS();
        b.videoCall();
    }
}
