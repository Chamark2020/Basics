package thread;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        // Сначала создать объект типа MyThread
        MyThread mt = new MyThread("Child #1");

        // Затем сформировать поток на основе этого объекта
        Thread newThrd = new Thread(mt);

        // Наконец начать выполнение потока
        newThrd.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
