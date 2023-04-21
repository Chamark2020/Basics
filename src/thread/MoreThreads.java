package thread;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

       /* for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");*/

        // Использование метода isAlive()
        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        } while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
        System.out.println("Завершение основного потока");
    }
}
