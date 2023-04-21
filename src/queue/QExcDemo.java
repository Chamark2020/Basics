package queue;

// Демонстрация исключений при работе с очередью
public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;

        try {
            // переполнение очереди
            for (int i = 0; i < 11; i++) {
                System.out.print("Попытка сохранения: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // Попытка извлечь символ из пустой очереди
            for (int i = 0; i < 11; i++) {
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
