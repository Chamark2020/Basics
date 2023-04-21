package thread;

public class Priority implements Runnable{
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    /*Создание нового потока. Обратите внимание на то,
    * что конструктор не запускает поток на выполнение. */

    Priority (String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // Начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("В " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;
        System.out.println("\n" + thrd.getName() + " - завершение");
    }
}
