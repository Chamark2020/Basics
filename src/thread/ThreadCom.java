package thread;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread3 mt1 = new MyThread3("Tick", tt);
        MyThread3 mt2 = new MyThread3("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
