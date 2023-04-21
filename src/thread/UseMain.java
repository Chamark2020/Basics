package thread;
// Управление основным потоком
public class UseMain {
    public static void main(String[] args) {

        // Получить ссылку на основной поток
        Thread thrd = Thread.currentThread();

        // Отобразить имя основного потока
        System.out.println("Имя основного потока: " + thrd.getName());

        // Отобразить приоритет основного потока
        System.out.println("Приоритет основного потока: " + thrd.getPriority());

        System.out.println();

        // Установить ися и приоритетть основного потока
        System.out.println("Установка имени и приоритета");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Новое имя основного потока: " + thrd.getName());

        System.out.println("Новое значение приоритета: " + thrd.getPriority());
    }
}
