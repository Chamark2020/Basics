package queue;
// исключение указывающее на переполнение очереди
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {size = s;}

    public String toString() {
        return "\nОчередь заполнена. " +
                "Максимальный размер очереди: " + size;
    }
}
