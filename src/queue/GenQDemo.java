package queue;

// Демонстрация обобщенного класса очереди
class GenQDemo {
    public static void main(String[] args) {
        // Создать очередь для хранения целых чисел
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Демонстрации очереди чисел типа Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + i + " в очередь q");
                q.put(i); // добавить целочисленное значение в очередь q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        // Создать очередь для хранения чисел с плавающей точкой
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Демонстрация очереди числе типа Double");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + (double)i/2 + " в очередь q2");
                q2.put((double)i/2); // ввести значение типа double в очередь q2
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следущего числа типа Double из очереди q2: ");

                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
