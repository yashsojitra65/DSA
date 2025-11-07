package OOP.Even_Odd;

class Printer {
    private boolean isOdd = false;
    synchronized void printEven(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + number);
        isOdd = true;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + number);
        isOdd = false;
        notify();
    }
}
class EvenThread extends Thread {
    private Printer printer;
    private int max;

    EvenThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
        setName("EvenThread");
    }

    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddThread extends Thread {
    private Printer printer;
    private int max;

    OddThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
        setName("OddThread");
    }

    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}
public class oddEven {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int max = 10;

        EvenThread evenThread = new EvenThread(printer, max);
        OddThread oddThread = new OddThread(printer, max);

        evenThread.start();
        oddThread.start();
    }
}
