package OOP.Thread;

public class Test2 implements Runnable{

    public void run(){
        System.out.println("Start Thread");
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Thread th = new Thread(test2);
        th.start();
    }
}
