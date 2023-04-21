package queue;
// демонстрация трех реализаций интерфейса ICharQ
class IQDemo {
    public static void main(String[] args) throws QueueEmptyException, QueueFullException {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;

        iQ = q1;
        // поместить ряд символов в очередь фиксированного размера
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        // отобразить содержимое очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // поместить ряд символов в динамическую очередь
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        // отобразить содержимое динамической очереди
        System.out.print("Содержимое динамичекой очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        // поместить ряд символов в кольцевую очередь
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        // отобразить содержимое кольцевой очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (int i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        //поместить больше символов в кольцевую очередь
        for (int i = 0; i < 20; i++) {
            iQ.put((char) ('Z' - i));
        }
        System.out.println();
        //отобразить содержимое очереди
        System.out.print("Содержимое кольцевое очереди: ");
        for (int i = 0; i < 20; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных " +
                "кольцевой очереди");

        // поместить символы в кольцевую очередь и извлечь их оттуда
        for (int i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
