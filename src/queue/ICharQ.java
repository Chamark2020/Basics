package queue;
// Интерфейс для очереди символов
public interface ICharQ {
    // Поместить символ в очередь
    void put (char ch) throws QueueFullException;

    // извлечь символ из очереди
    char get() throws QueueEmptyException;
}
