package OOP.Thread;

class Test extends Thread{
    public void run(){
        System.out.print("start thread");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
