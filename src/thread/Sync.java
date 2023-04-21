package thread;

public class Sync {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        MyThread2 mt1 = new MyThread2("Child #1", a);
        MyThread2 mt2 = new MyThread2("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
