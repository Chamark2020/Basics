package thread;
// Создание потока путем реализации интерфейса Runnable
class MyThread implements Runnable /*extends Thread*/{
   //Первая версия
    /*
    String thrdName;

    MyThread (String name) {
        thrdName = name;
    }

    // Точка входа в поток
    public void run() {
        System.out.println(thrdName + " - запуск");
        try {
            for (int count = 0; count < 10 ; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrdName + ", счетчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершение");
    }*/

    //Усовершенствованная версия класса MyThread

    Thread thrd;

    // Создать новый поток.
    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start(); //запустить поток
    }

    // Начать выполнение нового потока.
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " завершение");
    }
    // Расширение класса Thread
/*    // Создать новый поток.
    MyThread(String name) {
        super(name); // присвоить имя потоку
        start(); // запустить поток
    }

    // Начать выполнение нового потока.
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " завершение");
    }*/

}
