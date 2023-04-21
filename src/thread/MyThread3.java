package thread;
// Tick() Tock()
class MyThread3 implements Runnable{
    Thread thrd;
    TickTock ttOb;

    // Создать новый поток
    MyThread3(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // Запустить поток
    }

    // Начать выполнение нового потока
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
            }
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(true);
            }
            ttOb.tock(false);
        }
    }
}
