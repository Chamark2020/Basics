package thread;
// Синхронизация. Sync.java
public class MyThread2 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // Создать новый поток
    MyThread2(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    // Начать выполнение нового потока без блока синхронизации
        /*public void run() {
            int sum;
            System.out.println(thrd.getName() + " - запуск");
            answer = sa.sumArray(a);
            System.out.println("Сумма для " + thrd.getName() + ": " + answer);
            System.out.println(thrd.getName() + " - завершение");
        }*/

    // Начать выполнение нового потока с блоком синхронизации
    public void run() {
        int sum;
        System.out.println(thrd.getName() + " - запуск");
        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Сумма для " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - завершение");
    }
}
