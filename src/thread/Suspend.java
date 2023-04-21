package thread;

public class Suspend {
    public static void main(String[] args) {
        MyThread4 ob1 = new MyThread4("My Thread");

        try {
            Thread.sleep(1000); // Позволить потоку ob1 начать выполнение

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Остановка потока");
            ob1.myStop();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        //Ожидать завершения потока
        try {
            ob1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Выход из основного потока");
        }
     }
}
