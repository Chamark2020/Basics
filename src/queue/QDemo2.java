package queue;

public class QDemo2 {
    public static void main(String[] args) {
        // Создать пустую очередь для хранения 10 элементов
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        // Создать очередь на основе массива
        Queue q2 = new Queue(name);

        char ch;

        // Поместить ряд сиволов в очередь q1
        for (int i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Создать одну очередь на основе другой
        Queue q3 = new Queue(q1);

        // Показать очереди
        System.out.print("Содержимое q1: ");
        for (int i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.print("\n");

        System.out.print("Содержимое q2: ");
        for (int i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.print("\n");

        System.out.print("Содержимое q3: ");
        for (int i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
