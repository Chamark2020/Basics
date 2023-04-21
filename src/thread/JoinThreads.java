package thread;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 - присоединен");
            mt2.thrd.join();
            System.out.println("Child #2 - присоединен");
            mt3.thrd.join();
            System.out.println("Child #3 - присоединен");
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Завершение основного потока");
    }
}
